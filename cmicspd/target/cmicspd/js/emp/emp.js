/**
 * Created by Vincent on 2016/7/15.
 */
$(function () {

});


screen.availWidth


function queryEmp() {
    $("#mytbody").empty();
    var mytbodytemple = Handlebars.compile($("#mytbody-temple").html());
    Handlebars.registerHelper("indexhelp", function (index) {
            return index + 1;
        }
    )
    ;
    $.ajax({
            url: "http://localhost:8080/emp/api.do",
            type: 'post',
            cache: false,
            success: function (data) {
                $("#mytbody").append(mytbodytemple(data));

            },
            error: function (data) {

            }
        }
    );
}