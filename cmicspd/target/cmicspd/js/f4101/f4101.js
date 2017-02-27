/**
 * Created by Vincent on 2016/7/15.
 */
$(function () {
    var mytableTmp = Handlebars.compile($('#mytableTmp').html());
    /*
     注册添加序号
     */
    Handlebars.registerHelper("addone", function (index, options) {
        return parseInt(index) + 1;
    });

    Handlebars.registerHelper("transformat", function (value) {
        if (value == null || value == "") {
            return '空';
        } else {
            return value;
        }
    })
    loadF4101();
    /*var json = {
     "imitm":745686,
     "imlitm":"5030047 ",
     "imdsc1":"辣椒粉 ",
     "imdsc2":"21kg/袋 "
     };
     mytableTmp(json);
     $('#mytbody').html( mytableTmp(json));*/
    function loadF4101() {
        var aj = $.ajax({
            url: 'http://localhost:8080/item/map.do',// 跳转到 action

            type: 'post',
            cache: false,

            success: function (data) {
                console.info(data);
                $('#mytbody').html(mytableTmp(data));
            },
            error: function () {
                // view("异常！");

            }
        });

    }

});