package com.github.glomadrian.codeinput;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.glomadrian.codeinputlib.CodeInput;
import com.github.glomadrian.codeinputlib.CodeInputEditText;
import com.github.glomadrian.codeinputlib.callback.CodeInputCallback;

/**
 * updated by bajian
 * 增加string 类型返回
 * 优化个别代码性能,如attributes.recycle();等
 * 增加CodeInputCallback<T> 监听onInputFinish和onInput
 * 增加CodeInputEditText extends EditText 特性更多。比如可以很方便的时候et的特性，如maxLength，预输入..
 * 增加使用例子
 */
public class MainActivity extends AppCompatActivity implements CodeInputCallback<CodeInput>{

    private CodeInput ci;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ci=(CodeInput)findViewById(R.id.pairing);
        ci.setCodeInputListener(this);

        CodeInputEditText mCit = (CodeInputEditText) findViewById(R.id.cit);
        mCit.setCodeInputListener(new CodeInputCallback<CodeInputEditText>() {
            @Override
            public void onInputFinish(CodeInputEditText ci, String inputResult) {
                System.out.println("onInputFinish"+inputResult);

            }

            @Override
            public void onInput(CodeInputEditText ci, Character currentChar) {
                System.out.println("onInput"+currentChar);
            }
        });
    }

    public void getCode(View v){
        Toast.makeText(MainActivity.this,ci.getString(),Toast.LENGTH_LONG).show();
    }


    public void getCodeInputEditText(View v){

    }

    @Override
    public void onInputFinish(CodeInput ci, String inputResult) {
        System.out.println("inputResult"+inputResult);
    }

    @Override
    public void onInput(CodeInput ci, Character currentChar) {
        System.out.println("currentChar"+currentChar);
    }

}
