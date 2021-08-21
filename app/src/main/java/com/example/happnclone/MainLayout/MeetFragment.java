package com.example.happnclone.MainLayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.happnclone.Match.FormulaAdaptor;
import com.example.happnclone.LoginDetail.ProfileModel;
import com.example.happnclone.R;
import com.example.happnclone.LoginDetail.ResponseModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MeetFragment extends Fragment {


    private List<ProfileModel> profileModelList = new ArrayList<>();
    private CardStackLayoutManager manager;
    private FormulaAdaptor formulaAdaptor;
    private LottieAnimationView hearts, love, cry, loading;
    private CardStackView cardStackView;
    int count = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_meet, container, false);


        setRecycleAdapter();
        cardStackView = view.findViewById(R.id.stackview);
        hearts = view.findViewById(R.id.hearts);
        love = view.findViewById(R.id.love);
        cry = view.findViewById(R.id.cry);
        loading = view.findViewById(R.id.loadinghearts);

        manager = new CardStackLayoutManager(getActivity(), new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {

            }

            @Override
            public void onCardSwiped(Direction direction) {


                switch (direction) {
                    case Left:
                        Toast.makeText(getActivity(), "will look for others\"", Toast.LENGTH_SHORT).show();
                        cry.setVisibility(View.VISIBLE);
                        count++;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                cry.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        break;
                    case Right:
                        Toast.makeText(getActivity(), "Hey! its a Match", Toast.LENGTH_SHORT).show();
                        love.setVisibility(View.VISIBLE);

                        count++;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                love.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        break;
                }

                if (count == profileModelList.size()) {
                   loading.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onCardRewound() {

            }

            @Override
            public void onCardCanceled() {

            }

            @Override
            public void onCardAppeared(View view, int position) {

            }

            @Override
            public void onCardDisappeared(View view, int position) {

            }
        });

        cardSwipe();

        startBackgroundThread();


        return view;
    }


    private void cardSwipe() {
        manager.setStackFrom(StackFrom.None);
        manager.getItemCount();
        manager.setVisibleCount(20);
        manager.setTranslationInterval(3.0f);
        manager.setScaleInterval(1.195f);
        manager.setSwipeThreshold(0.3f);
        manager.setMaxDegree(15f);
        manager.setDirections(Direction.FREEDOM);
        manager.setCanScrollHorizontal(true);
        manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual);
        manager.setOverlayInterpolator(new LinearInterpolator());
        formulaAdaptor = new FormulaAdaptor(profileModelList);
        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(formulaAdaptor);
    }

    private void setRecycleAdapter() {
        formulaAdaptor = new FormulaAdaptor(profileModelList);

    }


    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            readJsonFromAssets();
        }
    };

    private void startBackgroundThread() {
        Thread thread = new Thread(runnable);
        thread.start();
    }


    private void readJsonFromAssets() {

        try {
            InputStream inputStream = getContext().getAssets().open("formula.json");
            int data = inputStream.read();

            StringBuilder builder = new StringBuilder();

            while (data != -1) {
                char ch = (char) data;
                builder.append(ch);

                data = inputStream.read();
            }

            buildPOJOFromJSON(builder);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void buildPOJOFromJSON(StringBuilder builder) {
        String json = builder.toString();
        Gson gson = new Gson();
        Type type = new TypeToken<ResponseModel>() {
        }.getType();
        ResponseModel responseModel = gson.fromJson(json, type);
        profileModelList = responseModel.getProfile();
        updateUI();
    }

    private void updateUI() {

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {

                formulaAdaptor.updateData(profileModelList);
            }
        });
    }
}