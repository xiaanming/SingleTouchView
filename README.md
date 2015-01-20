# SingleTouchView
Single finger control image scale rotate and translate， there is a custom view in Android

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

#Effect
[https://github.com/xiaanming/SingleTouchView/blob/master/sample.gif]
