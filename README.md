# HsOptionActivity
1. Main이 되는 Activity
<pre><code>
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
</code></pre>

2. 메뉴 /res/menu/youtmenu.xml
<pre><code>
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item android:title="Item_1"
          android:id="@+id/Item_1"
        />
    <item
        android:id="@+id/Item_2"
        android:title="Item_2"/>
</menu>
</code></pre>

