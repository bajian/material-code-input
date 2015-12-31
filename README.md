 * updated by bajian
 * 增加string 类型返回
 * 优化个别代码性能,如attributes.recycle();等
 * 增加CodeInputCallback<T> 监听onInputFinish和onInput
 * 增加CodeInputEditText extends EditText 特性更多。比如可以很方便的时候et的特性，如maxLength，预输入..
 * 增加使用例子

Material Code input
-----------------

A material style input for put codes

![Demo Screenshot][1]

![Demo Screenshot][2]


Based on
----------

[Code input field concept](http://www.materialup.com/posts/code-input-field-concept) by [SAMUEL KANTALA](http://www.materialup.com/ontidop)


How to use
----------

Minimal SDK Version 11

Usage with default colors (the default codes is 6)

```xml
  <com.github.glomadrian.codeinputlib.CodeInput
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      app:hint_text="Pairing code"
      />
```

Usage with custom colors and attributes

```xml
<com.github.glomadrian.codeinputlib.CodeInput
    android:layout_marginTop="20dp"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:underline_color="#457ad1"
    app:underline_selected_color="#9e1ace"
    app:text_color="#b12eff"
    app:hint_color="#77ce9d"
    app:hint_text="Pin code"
    app:codes="4"
    />
```

```

  <com.github.glomadrian.codeinputlib.CodeInputEditText
      android:id="@+id/cit"
      android:layout_marginTop="20dp"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      app:underline_color="#03A9F4"
      app:underline_selected_color="#3F51B5"
      app:text_color="#212121"
      app:hint_color="#03A9F4"
      app:hint_text="CodeInputEditText"
      app:codes="7"
      android:maxLength="7"
      />
```


Remember put this for custom attribute usage

```java

xmlns:app="http://schemas.android.com/apk/res-auto"

```

Get the input code (Returns a Character[])

```java
  codeInput.getCode()
  
  codeInput.getString()
```

Developed By
------------
bajian - <313066164@qq.com>
Adrián García Lomas - <glomadrian@gmail.com>

License
-------

    Copyright 2015 bajian

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: ./art/codeInput1.gif
[2]: ./art/codeInput2.gif
