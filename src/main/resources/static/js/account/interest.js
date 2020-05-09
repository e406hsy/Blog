(function () {
    var button = document.getElementById("calculate_btn");
    button.addEventListener("click", calculate);

    function calculate() {
        var tableBody = document.getElementsByTagName("tbody")[0];

        while (tableBody.firstChild) {
            tableBody.removeChild(tableBody.firstChild);
        }

        var amount = document.getElementById("amount").value;
        var rate = document.getElementById("rates").value;
        if (rate < 0) {
            window.alert("rate should be positive value.");
            return;
        }
        rate = Math.pow(1 + rate / 100, 1 / 12);

        var total = amount;
        for (var month = 1; month <= 6 * 12; month++) {
            total = total * rate;
            let child = document.createElement("tr");

            let monthNode = document.createElement("td");
            let amountNode = document.createElement("td");
            let interestNode = document.createElement("td");
            let totalNode = document.createElement("td");

            monthNode.innerText = month;
            amountNode.innerText = new Intl.NumberFormat('ko-KR', { maximumFractionDigits: 3 }).format(amount);
            interestNode.innerText = new Intl.NumberFormat('ko-KR', { maximumFractionDigits: 3 }).format(total - amount);
            totalNode.innerText = new Intl.NumberFormat('ko-KR', { maximumFractionDigits: 3 }).format(total);

            child.appendChild(monthNode);
            child.appendChild(amountNode);
            child.appendChild(interestNode);
            child.appendChild(totalNode);

            tableBody.appendChild(child);
        }
    }
})();