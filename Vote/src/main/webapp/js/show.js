$(document).ready(function(){
    //从服务端获取数据，然后在客户端显示
    $.ajax({
        url:'vote/showAction',
        type:'post',
        dataType:'json',
        success:function (voteResult) {
            show(voteResult)
        }
    });
});

function show(result){
    var jsonResult = $.parseJSON(result);
    $("#voteTable").append("<tr> <td>People one:</td> <td>" + jsonResult.personOneResult +"</td> </tr>")
    .append("<tr> <td>People two:</td> <td>" + jsonResult.personTwoResult +"</td> </tr>")
    .append("<tr> <td>People three:</td> <td>" + jsonResult.personThreeResult +"</td> </tr>")
    .append("<tr> <td>People four:</td> <td>" + jsonResult.personFourResult +"</td> </tr>")
    .append("<tr> <td>People five:</td> <td>" + jsonResult.personFiveResult +"</td> </tr>");
}
