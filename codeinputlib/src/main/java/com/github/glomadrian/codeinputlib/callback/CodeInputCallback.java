package com.github.glomadrian.codeinputlib.callback;

/**
 * Created by bajian on 2015/12/30.
 * email 313066164@qq.com
 * T类型一定要传对。否则应该会报classcast
 * T传入的目的是为了更方便的控制CodeInput输入，如校验这个字母符不符合格式，不符合就删了。暂时没需求就没写这些方法
 */
public interface CodeInputCallback<T> {

    void onInputFinish(T ci,String inputResult);
    void onInput(T ci,Character currentChar);

}
