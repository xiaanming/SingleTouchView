# SingleTouchView
Single finger control image scale rotate and translate， there is a custom view in Android

<<<<<<< Updated upstream
# ScreenShot
![](https://github.com/xiaanming/SingleTouchView/blob/master/sample.gif)


# Usage
``` xml
 <com.example.singletouchview.SingleTouchView
            xmlns:app="http://schemas.android.com/apk/res-auto"
            android:id="@+id/SingleTouchView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:scale="1.2"
            app:src="@drawable/scale"
            app:frameColor="#0022ff"
            app:controlLocation="right_top"/>
``` 

# License
```
Copyright 2014 xiaanming.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
=======
#custom properties
<resources>
    <declare-styleable name="SingleTouchView">
        <attr name="src" format="reference" />           
        <attr name="editable" format="boolean"/>          
        <attr name="frameColor" format="color" />         
        <attr name="frameWidth" format="dimension" />     
        <attr name="framePadding" format="dimension" />   
        <attr name="degree" format="float" />             
        <attr name="scale" format="float" />              
        <attr name="controlDrawable" format="reference"/> 
        <attr name="controlLocation">                    
            <enum name="left_top" value="0" />
            <enum name="right_top" value="1" />
            <enum name="right_bottom" value="2" />
            <enum name="left_bottom" value="3" />
        </attr>
    </declare-styleable>
</resources>


#
>>>>>>> Stashed changes
