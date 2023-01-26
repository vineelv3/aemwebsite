/*
* First give granite:class as check-box-checked
* we can write this js by another method
---------------------------------------------------
(function ($, $document, gAuthor) {
    "use strict";
    $document.on("dialog-ready", function(e) {

    });
})($, $(document), Granite.author);
----------------------------------------------------
*/

(function ($, Coral) {
    "use strict";
    $(document).on("dialog-ready", function() {
       $(document).on('change', '.check-box-checked', checkEnable);

        if($('.check-box-checked').length > 0) {
            checkEnable();
        }

        var value;
        value = $('div.coral-Form-fieldwrapper input[name="./name"]').val();
        if(value == "done"){
            textFilledAsDone();
        }

        function checkEnable(){
            if($(".check-box-checked").attr("checked")){
                //To empty the RTE field value
                $('div.coral-Form-fieldwrapper input[name="./rteComponent"]').prop("value","");
                //To Hide RTE Box as well as RTE Lable name 
                $('div.coral-Form-fieldwrapper input[name="./rteComponent"]').parents('.coral-Form-fieldwrapper').css("display","none");
            }
            else{
                $('div.coral-Form-fieldwrapper input[name="./rteComponent"]').parents('.coral-Form-fieldwrapper').css("display","block");
            }
        }

        function textFilledAsDone(){
            $('div.coral-Form-fieldwrapper input[name="./rteComponent"]').parents('.coral-Form-fieldwrapper').css("display","none");
            //To check check-box as checked
            $(".check-box-checked").prop("checked", true);
            //To make check-box as disabled
            $(".check-box-checked").prop("disabled", true);
            //To make RTE field value as empty 
            $('div.coral-Form-fieldwrapper input[name="./rteComponent"]').prop("value","");
        }

    });

})($);
