<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link href="../res/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="../res/css/style.css"/>
    <link rel="stylesheet" href="../res/assets/css/ace.min.css" />
    <link rel="stylesheet" href="../res/assets/css/font-awesome.min.css" />
    <link rel="stylesheet" href="../res/Widget/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <link href="../res/Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />
    <!--[if IE 7]>
    <link rel="stylesheet" href="../res/assets/css/font-awesome-ie7.min.css" />
    <![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="../res/assets/css/ace-ie.min.css" />
    <![endif]-->
    <script src="../res/js/jquery-1.9.1.min.js"></script>
    <script src="../res/assets/js/bootstrap.min.js"></script>
    <script src="../res/assets/js/typeahead-bs2.min.js"></script>
    <!-- page specific plugin scripts -->
    <script src="../res/assets/js/jquery.dataTables.min.js"></script>
    <script src="../res/assets/js/jquery.dataTables.bootstrap.js"></script>
    <script type="text/javascript" src="../res/js/H-ui.js"></script>
    <script type="text/javascript" src="../res/js/H-ui.admin.js"></script>
    <script src="../res/assets/layer/layer.js" type="text/javascript" ></script>
    <script src="../res/assets/laydate/laydate.js" type="text/javascript"></script>
    <script type="text/javascript" src="../res/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
    <script src="../res/js/lrtk.js" type="text/javascript" ></script>
    <script src="../res/js/product/type/product_type.js" type="text/javascript" ></script>
    <title>产品列表</title>
</head>
<body>
<div class=" page-content clearfix">
    <div id="products_style">
        <div class="search_style">

            <ul class="search_content clearfix">
                <li><label class="l_f">产品名称</label><input name="" type="text"  class="text_add" placeholder="输入品牌名称"  style=" width:250px"/></li>
                <li><label class="l_f">添加时间</label><input class="inline laydate-icon" id="start" style=" margin-left:10px;"></li>
                <li style="width:90px;"><button type="button" class="btn_search"><i class="icon-search"></i>查询</button></li>
            </ul>
        </div>
        <div class="border clearfix">
       <span class="l_f">
        <a href="product-add" title="添加商品" class="btn btn-warning Order_form"><i class="icon-plus"></i>添加商品</a>
        <a href="javascript:ovid()" class="btn btn-danger"><i class="icon-trash"></i>批量删除</a>
       </span>
            <span class="r_f">共：<b>2334</b>件商品</span>
        </div>
        <!--产品列表展示-->
        <div class="h_products_list clearfix" id="products_list">
            <div id="scrollsidebar" class="left_Treeview">
                <div class="show_btn" id="rightArrow"><span></span></div>
                <div class="widget-box side_content" >
                    <div class="side_title"><a title="隐藏" class="close_btn"><span></span></a></div>
                    <div class="side_list"><div class="widget-header header-color-green2"><h4 class="lighter smaller">产品类型列表</h4></div>
                        <div class="widget-body">
                            <div class="widget-main padding-8"><div id="treeDemo" class="ztree"></div></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="table_menu_list" id="testIframe">
                <table class="table table-striped table-bordered table-hover" id="sample-table">
                    <thead>
                    <tr>
                        <th width="25px"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
                        <th width="80px">产品编号</th>
                        <th width="250px">产品名称</th>
                        <th width="100px">原价格</th>
                        <th width="100px">现价</th>
                        <th width="100px">所属地区/国家</th>
                        <th width="180px">加入时间</th>
                        <th width="80px">审核状态</th>
                        <th width="70px">状态</th>
                        <th width="200px">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td width="25px"><label><input type="checkbox" class="ace" ><span class="lbl"></span></label></td>
                        <td width="80px">45631</td>
                        <td width="250px"><u style="cursor:pointer" class="text-primary" onclick="">小米 Max 全网通 高配版 3GB内存 64GB ROM 金色 移动联通电信4G手机Y</u></td>
                        <td width="100px">5467</td>
                        <td width="100px">4525</td>
                        <td width="100px">法国</td>
                        <td width="180px">2014-6-11 11:11:42</td>
                        <td class="text-l">通过</td>
                        <td class="td-status"><span class="label label-success radius">已启用</span></td>
                        <td class="td-manage">
                            <a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                            <a title="编辑" onclick="member_edit('编辑','member-add.html','4','','510')" href="javascript:;"  class="btn btn-xs btn-info" ><i class="icon-edit bigger-120"></i></a>
                            <a title="删除" href="javascript:;"  onclick="member_del(this,'1')" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
<script>
    jQuery(function($) {
        var oTable1 = $('#sample-table').dataTable( {
            "aaSorting": [[ 1, "desc" ]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {"orderable":false,"aTargets":[0,2,3,4,5,8,9]}// 制定列不参与排序
            ] } );


        $('table th input:checkbox').on('click' , function(){
            var that = this;
            $(this).closest('table').find('tr > td:first-child input:checkbox')
                    .each(function(){
                        this.checked = that.checked;
                        $(this).closest('tr').toggleClass('selected');
                    });

        });


        $('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
        function tooltip_placement(context, source) {
            var $source = $(source);
            var $parent = $source.closest('table')
            var off1 = $parent.offset();
            var w1 = $parent.width();

            var off2 = $source.offset();
            var w2 = $source.width();

            if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
            return 'left';
        }
    });
    laydate({
        elem: '#start',
        event: 'focus'
    });
    $(function() {
        $("#products_style").fix({
            float : 'left',
            //minStatue : true,
            skin : 'green',
            durationTime :false,
            spacingw:30,//设置隐藏时的距离
            spacingh:260,//设置显示时间距
        });
    });
</script>
