/*
 * Copyright 2017 Yan Zhenjie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.sgpublic.sofiaxsample.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import io.github.sgpublic.sofiax.Sofia;
import io.github.sgpublic.sofiaxsample.R;

/**
 * <p>
 * Dark font status bar.
 * </p>
 * Created by YanZhenjie on 2017/8/2.
 */
public class DarkFontStatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark_font);

        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        Sofia.with(this)
                .statusBarDarkFont()
                .statusBarBackground(ContextCompat.getColor(this, R.color.white))
                .navigationBarBackground(ContextCompat.getColor(this, R.color.colorNavigation));
    }
}
