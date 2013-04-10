function vote(id) {
    switch(id) {
        case "one":
            submit(1);
            break;
        case "two":
            submit(2);
            break;
        case "three":
            submit(3);
            break;
        case "four":
            submit(4);
            break;
        case "five":
            submit(5);
            break;
        default:
            submit(0);
            break;
    }
}

function submit(id) {
    $.ajax({
        url:'vote/voteAction',
        type:'post',
        data:{id: id},
        dataType:'json',
        success:function (msg) {
            alert("Thanks for vote person " + id)
        }
    });
}

function goResult() {
    location.href ="../pages/result.jsp"
}
