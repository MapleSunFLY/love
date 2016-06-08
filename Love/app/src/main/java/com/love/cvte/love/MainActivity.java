package com.love.cvte.love;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import android.os.Handler;
import android.widget.Toast;

import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener{
    private static int TIME =100;
    private float resize = (float)0.1;
    private int loop = 0;
    private Context mContext;
    private MediaPlayer mMediaPlayer;
    private RelativeLayout mRelativeLayout;
    private Resources mResources;
    private ImageView mImageView1;
    private ImageView mImageView2;
    private ImageView mImageView3;
    private MyView myView;
    private Handler handler;
    private float[] mfloat =new float[]
    {
            (float)0.1,
            (float)0.15,
            (float)0.2,
            (float)0.25,
            (float)0.3,
            (float)0.35,
            (float)0.4,
            (float)0.45,
            (float)0.5,
            (float)0.6,
            (float)0.5,
            (float)0.45,
            (float)0.4,
            (float)0.35,
            (float)0.3,
            (float)0.25,
            (float)0.2,
            (float)0.15,
            (float)0.1,
    };
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if(loop >= 18)
            {
                loop = 0;
            }
            loop++;
            myView.setReizeX(mfloat[loop]);
            myView.setResizaY(mfloat[loop]);
            handler.postDelayed(runnable, TIME);
            myView.invalidate();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        mResources = this.getResources();
        setContentView(R.layout.activity_main);
        AudioManager mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
         if((mAudioManager.getStreamVolume( AudioManager.STREAM_MUSIC ) < 3))
         {
             Toast.makeText(this,"音量太小了哦！",Toast.LENGTH_LONG).show();
         }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.layout);
        mImageView1 = (ImageView)findViewById(R.id.imageView1);
        mImageView2 = (ImageView)findViewById(R.id.imageView2);
        mImageView3 = (ImageView)findViewById(R.id.imageView3);
        mImageView1.setImageDrawable(mResources.getDrawable(R.drawable.love10));
        mImageView2.setImageDrawable(mResources.getDrawable(R.drawable.love11));
        Animation animation1 = new AlphaAnimation(0,1);
        animation1.setRepeatMode(2);
        animation1.setDuration(37000);
        animation1.setAnimationListener(listener1);
        mImageView2.startAnimation(animation1);
        myView = new MyView(this);
        mRelativeLayout.addView(myView);
        handler = new Handler();
        handler.postDelayed(runnable, TIME);
    }
    private Animation.AnimationListener listener1= new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            Animation animation2 = new AlphaAnimation(0,1);
            animation2.setDuration(2000);
            animation2.setRepeatMode(2);
            myView.setImageIndex(1);
            mImageView1.setImageDrawable(mResources.getDrawable(R.drawable.love20));
            mImageView2.setImageDrawable(mResources.getDrawable(R.drawable.love21));
            mImageView3.setImageDrawable(mResources.getDrawable(R.drawable.love22));
            mImageView1.startAnimation(animation2);
            mImageView2.startAnimation(animation2);
            Animation animation3 = new AlphaAnimation(0,1);
            animation3.setDuration(37000);
            animation3.setRepeatMode(2);
            animation3.setAnimationListener(listener3);
            mImageView3.startAnimation(animation3);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
    private Animation.AnimationListener listener3= new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            Animation animation4 = new AlphaAnimation(0,1);
            animation4.setDuration(2000);
            animation4.setRepeatMode(2);
            myView.setImageIndex(2);
            mImageView1.setImageDrawable(mResources.getDrawable(R.drawable.love30));
            mImageView2.setImageDrawable(mResources.getDrawable(R.drawable.love31));
            mImageView3.setImageDrawable(mResources.getDrawable(R.drawable.love32));
            mImageView1.startAnimation(animation4);
            mImageView2.startAnimation(animation4);
            Animation animation5 = new AlphaAnimation(0,1);
            animation5.setDuration(37000);
            animation5.setRepeatMode(2);
            animation5.setAnimationListener(listener5);
            mImageView3.startAnimation(animation5);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
    private Animation.AnimationListener listener5 = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            Animation animation6 = new AlphaAnimation(0,1);
            animation6.setDuration(2000);
            animation6.setRepeatMode(2);
            myView.setImageIndex(3);
            mImageView1.setImageDrawable(mResources.getDrawable(R.drawable.love40));
            mImageView2.setVisibility(View.INVISIBLE);
            mImageView3.setImageDrawable(mResources.getDrawable(R.drawable.love41));
            mImageView1.startAnimation(animation6);
            mImageView2.startAnimation(animation6);
            Animation animation7 = new AlphaAnimation(0,1);
            animation7.setDuration(37000);
            animation7.setRepeatMode(2);
            animation7.setAnimationListener(listener7);
            mImageView3.startAnimation(animation7);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
    private Animation.AnimationListener listener7 = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            Animation animation8 = new AlphaAnimation(0,1);
            animation8.setDuration(2000);
            animation8.setRepeatMode(2);
            myView.setImageIndex(4);
            mImageView1.setImageDrawable(mResources.getDrawable(R.drawable.love50));
            mImageView3.setImageDrawable(mResources.getDrawable(R.drawable.love51));
            mImageView1.startAnimation(animation8);
            Animation animation9 = new AlphaAnimation(0,1);
            animation9.setDuration(37000);
            animation9.setRepeatMode(2);
            animation9.setAnimationListener(listener9);
            mImageView3.startAnimation(animation9);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
    private Animation.AnimationListener listener9 = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            finish();
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
    @Override
    protected void onResume() {
        mMediaPlayer = MediaPlayer.create(this,R.raw.man);
        mMediaPlayer.setOnCompletionListener(this);
        mMediaPlayer.start();
        super.onResume();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
            {
                mMediaPlayer.stop();
                break;
            }
            case KeyEvent.KEYCODE_HOME:
            {
                mMediaPlayer.stop();
                break;
            }
            default:
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onPause() {
        mMediaPlayer.stop();
        super.onPause();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        myView.setX(event.getX());
        myView.setY(event.getY());
        myView.invalidate();
        return super.onTouchEvent(event);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        try{
            this.finish();
        }catch(Exception e)
        {
            e.printStackTrace();;
        }
    }
}
