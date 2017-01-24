package kr.co.hs.app.optionactivity;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import kr.co.hs.app.HsActivity;

/**
 * 생성된 시간 2017-01-24, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsOptionActivity
 * 패키지명 : kr.co.hs.app.optionactivity
 */

public abstract class HsOptionActivity extends HsActivity {

    Toolbar mToolbar;
    LinearLayout mLinearLayout;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(R.layout.hsactivity_option_main);
        mToolbar = (Toolbar) findViewById(R.id.Toolbar);
        if(mToolbar != null)
            setSupportActionBar(mToolbar);

        mLinearLayout = (LinearLayout) findViewById(R.id.LinearLayoutContents);
        View layoutView = LayoutInflater.from(getContext()).inflate(layoutResID, mLinearLayout, false);
        if(layoutView != null)
            mLinearLayout.addView(layoutView);
    }
}
