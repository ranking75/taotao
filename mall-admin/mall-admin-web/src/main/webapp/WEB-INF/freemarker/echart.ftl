</!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>QQ部
        星座分布图</title>
    <script src="../res/js/echarts.min.js"></script>
</head>
<body>
<div id="main" style="width:800px;height:800px"></div>

<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));
    var option = {
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b}: {c} ({d}%)"
        },

        series: [
            {
                name:'星座',
                type:'pie',
                selectedMode: 'single',
                radius: ['75%', '96%'],

                label: {
                    normal: {
                        position: 'inside',
                        fontSize: 20,
                        color:'',
                        fontFamily:'Microsoft Yahei'
                    }
                },
                data:[
                    {value:4, name:'双子座'},
                    {value:3, name:'白羊座'},
                    {value:3, name:'金牛座'},
                    {value:2, name:'天蝎座'},
                    {value:2, name:'双鱼座'},
                    {value:2, name:'处女座'},
                    {value:2, name:'射手座'},
                    {value:1, name:'摩羯座'},
                    {value:1, name:'天秤座'},
                    {value:1, name:'水瓶座'},
                    {value:1, name:'狮子座'}
                ]
            },
            {
                name:'姓名',
                type:'pie',
                radius: ['30%', '70%'],
                label: {
                    normal: {
                        position:'inside',
                        align:'right',
                        fontSize: 18,
                        fontFamily:'Microsoft YaHei',
                        color:"#FFEFE0"
                    }
                },
                data:[
                    {value:1, name:'X1'},
                    {value:1, name:'X2'},
                    {value:1, name:'X3'},
                    {value:1, name:'X4'},
                    {value:1, name:'M1'},
                    {value:1, name:'M2'},
                    {value:1, name:'M3'},
                    {value:1, name:'N1'},
                    {value:1, name:'N2'},
                    {value:1, name:'N3'},
                    {value:1, name:'D1'},
                    {value:1, name:'D2'},
                    {value:1, name:'D3'},
                    {value:1, name:'F1'},
                    {value:1, name:'F2'},
                    {value:1, name:'F3'},
                    {value:1, name:'G1'},
                    {value:1, name:'A1'},
                    {value:1, name:'W1'},
                    {value:1, name:'E1'},
                    {value:1, name:'E2'},
                    {value:1, name:'E3'}
                ]
            },
            {
                name:'部门',
                type:'pie',
                radius: ['0%', '25%'],
                label: {
                    normal: {
                        position: 'center',
                        fontSize: 22,
                        fontFamily:'Microsoft YaHei',
                        color:'#80F0E3'
                    }
                },
                data:[
                    {value:22, name:'QQ'},
                    {value:22, name:'微信'}
                ]
            }
        ]
    };
    myChart.setOption(option);
</script>
</body>
</html>