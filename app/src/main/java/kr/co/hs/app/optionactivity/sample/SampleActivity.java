package kr.co.hs.app.optionactivity.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;

import kr.co.hs.app.optionactivity.HsOptionActivity;

/**
 * 생성된 시간 2017-01-24, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsOptionActivity
 * 패키지명 : kr.co.hs.app.optionactivity.sample
 */

public class SampleActivity extends HsOptionActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sample, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Item_1:{
                //TODO
                return true;
            }
            case R.id.Item_2:{
                //TODO
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
