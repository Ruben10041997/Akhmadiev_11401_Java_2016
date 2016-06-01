f = function (select) {
    jQuery.ajax(
        {
            url: "/orders/ajax",
            data: {"select": jQuery("#select").val()},
            headers: {
                Accept: 'application/json'
            },
            dataType: "json",
            success: function (response_data) {
                if (response_data !== undefined) {
                    jQuery("#res").html("");
                    for (var i = 0; i < response_data.length; i++) {
                        jQuery("#res").append(
                            "<table border='2'>" +
                            "<list>" +
                            "<tr>" +
                            "<td>" + response_data[i].id + "</td>" +
                            "<td>" + response_data[i].ordersName + "</td>" +
                            "<td>" + response_data[i].requiredTransport + "</td>" +
                            "<td>" + response_data[i].deadline + "</td>" +
                            "<td>" + response_data[i].price + "</td>" +
                            "<td>" + response_data[i].status + "</td>" +
                            "</tr>" +
                            "</list>" +
                            "</table>"
                        )

                    }


                }
                else {
                    jQuery("#res").append("No!")
                }
            }

        });
};

f();
change = function (param) {
    jQuery("#select").val(param);
    f();
};