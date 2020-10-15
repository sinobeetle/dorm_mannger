
    function GetData()
    {
        var username=$("#username").val();
        var password=$("#password").val();
    }
    function ToJSON()
    {
        jsonData={
            "username":GetData.username,
            "password":GetData.password,
        }
    }
    $(document).ready(function()
    {
        $("#login").click(function()
        {
            GetData();
            ToJSON();
            $.post("loginServlet",jsonData,function (data,status)
            {
                alert("数据: \n" + data + "\n状态: " + status);
            })
        })
    })