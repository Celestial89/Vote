<html>
<head>
    <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../js/main.js"></script>
</head>
<body>
    <h2 align="center">Vote Maven Webapp</h2>
    <form id="voteForm">
        <table id="voteTable"  align="center">
            <tr>
                <td>People one:</td>
                <td> <input type="button" id="one" value="vote" onclick="vote(this.id);"> </td>
            </tr>
            <tr>
                <td>People two:</td>
                <td> <input type="button" id="two" value="vote" onclick="vote(this.id);"> </td>
            </tr>
            <tr>
                <td>People three:</td>
                <td> <input type="button" id="three" value="vote" onclick="vote(this.id);"> </td>
            </tr>
            <tr>
                <td>People four:</td>
                <td> <input type="button" id="four" value="vote" onclick="vote(this.id);"> </td>
            </tr>
            <tr>
                <td>People five:</td>
                <td> <input type="button" id="five" value="vote" onclick="vote(this.id);"> </td>
            </tr>
            <tr>
                <td>
                    <input type="button" id="result" value="Show result..." onclick="goResult();">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
