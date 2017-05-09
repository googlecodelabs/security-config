/*
 * Copyright 2017 Google Inc. All rights reserved.
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

package com.example.networksecurity;

import com.example.networksecurity.model.Post;

/**
 * Contract defining the interface between the View and Presenter.
 */
public interface MainContract {

    interface View {
        /**
         * Sets the presenter for interaction from the View.
         *
         * @param presenter
         */
        void setPresenter(Presenter presenter);

        /**
         * Displays or hides a loading indicator.
         *
         * @param isLoading If true, display a loading indicator, hide it otherwise.
         */
        void setLoadingPosts(boolean isLoading);

        /**
         * Displays a list of posts on screen.
         */
        void setPosts(Post[] posts);

        /**
         * Displays an error message on screen and optionally prints out the error to logcat.
         */
        void showError(String title, String error);
    }

    interface Presenter {
        /**
         * Loads post for display.
         */
        void loadPosts();

        /**
         * An error was encountered during the loading of profile images.
         */
        void onLoadPostImageError(String error, Exception e);
    }

}
