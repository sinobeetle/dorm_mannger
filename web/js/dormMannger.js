 function DoLoginPost()
    {
        var JsonData

        JsonData = {
                "username": $("#username").val(),
                "password": $("#password").val()
        }
        var data=(JSON.stringify(JsonData))
        $.ajax({
            type:"post",
            data:data,
            url:"loginServlet",
            contentType:"application/json;charset=utf-8",
            dataType:"json",
            success:function ()
            {
                alert(status)
            },
            error:function (){
                alert(status)
            }
        })
        // $.post("loginServlet",JsonData,function (data,status)
        //     {
        //             alert("数据: \n" + data + "\n状态: " + status);
        //
        //     })
    }

 function DoRegisterPost()
 {
     var JsonData

     JsonData = {
         "username": $("#RegisterUserName").val(),
         "password": $("#RegisterPassword").val(),
         "phone_number":$("#RegisterPhoneNumber").val(),
         "id":$("#RegisterId").val()
     }
     var data=(JSON.stringify(JsonData))
     $.ajax({
         type:"post",
         data:data,
         url:"RegisterServlet",
         contentType:"application/json;charset=utf-8",
         dataType:"json",
         success:function ()
         {
             alert(status)
         },
         error:function (){
             alert(status)
         }
     })
     // $.post("loginServlet",JsonData,function (data,status)
     //     {
     //             alert("数据: \n" + data + "\n状态: " + status);
     //
     //     })
 }
    $(document).ready(function ()
    {
        $("#login").click(function ()
        {
            DoLoginPost();
        })
        })
 $(document).ready(function ()
 {
     $("#register").click(function ()
     {
         DoRegisterPost();
     })
 })
