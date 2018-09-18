$.ajaxSetup({
    async:false
});
$(function(){
    var t = $("#treeDemo");
    //加载节点数据
    // var zNodes =[
    //     { id:1, pId:0, name:"商城分类列表", open:true},
    //     { id:11, pId:1, name:"蔬菜水果"},
    //     { id:111, pId:11, name:"蔬菜"},
    //     { id:112, pId:11, name:"苹果"},
    //     { id:113, pId:11, name:"大蒜"},
    //     { id:114, pId:11, name:"白菜"},
    //     { id:115, pId:11, name:"青菜"},
    //     { id:12, pId:1, name:"手机数码"},
    //     { id:121, pId:12, name:"手机 "},
    //     { id:122, pId:12, name:"照相机 "},
    //     { id:13, pId:1, name:"电脑配件"},
    //     { id:131, pId:13, name:"手机 "},
    //     { id:122, pId:13, name:"照相机 "},
    //     { id:14, pId:1, name:"服装鞋帽"},
    //     { id:141, pId:14, name:"手机 "},
    //     { id:42, pId:14, name:"照相机 "},
    //     { id:55,pId:11,name:"橘子"}
    // ];
    var zNodes =[
        { productTypeId:1, productTypeParentId:0, name:"商城分类列表", open:true},
        { productTypeId:11, productTypeParentId:1, name:"蔬菜水果"},
        { productTypeId:111, productTypeParentId:11, name:"蔬菜"},
        { productTypeId:112, productTypeParentId:11, name:"苹果"},
        { productTypeId:113, productTypeParentId:11, name:"大蒜"},
        { productTypeId:114, productTypeParentId:11, name:"白菜"},
        { productTypeId:115, productTypeParentId:11, name:"青菜"},
        { productTypeId:12, productTypeParentId:1, name:"手机数码"},
        { productTypeId:121, productTypeParentId:12, name:"手机 "},
        { productTypeId:122, productTypeParentId:12, name:"照相机 "},
        { productTypeId:13, productTypeParentId:1, name:"电脑配件"},
        { productTypeId:131, productTypeParentId:13, name:"手机 "},
        { productTypeId:122, productTypeParentId:13, name:"照相机 "},
        { productTypeId:14, productTypeParentId:1, name:"服装鞋帽"},
        { productTypeId:141, productTypeParentId:14, name:"手机 "},
        { productTypeId:42, productTypeParentId:14, name:"照相机 "},
    ];
    console.log(zNodes);
    t = $.fn.zTree.init(t, setting, loadNodeData());
    demoIframe = $("#testIframe");
    demoIframe.bind("load", loadReady);
    var zTree = $.fn.zTree.getZTreeObj("tree");
    zTree.selectNode(zTree.getNodeByParam("id",'11'));
});

//初始化宽度、高度
$(".widget-box").height($(window).height()-215);
$(".table_menu_list").width($(window).width()-260);
$(".table_menu_list").height($(window).height()-215);
//当文档窗口发生改变时 触发
$(window).resize(function(){
    $(".widget-box").height($(window).height()-215);
    $(".table_menu_list").width($(window).width()-260);
    $(".table_menu_list").height($(window).height()-215);
})

/*******树状图*******/
var setting = {
    view: {
        dblClickExpand: false,
        showLine: false,
        selectedMulti: false
    },
    data: {
        simpleData: {
            enable:true,
            idKey: "productTypeId",
            pIdKey: "productTypeParentId",
            rootPId: ""
        }
    },
    callback: {
        beforeClick: function(treeId, treeNode) {
            var zTree = $.fn.zTree.getZTreeObj("tree");
            if (treeNode.isParent) {
                alert(treeId);
                zTree.expandNode(treeNode);
                return false;
            } else {
                demoIframe.attr("src",treeNode.file + ".html");
                return true;
            }
        },
        onClick: zTreeOnClick
    }
};
//节点绑定点击事件
function zTreeOnClick(event, treeId, treeNode) {
    alert(treeNode.tId + ", " + treeNode.name);
};

function loadNodeData(){
    var types = [];
    $.get("../productType/getAllProductType",{},function(result){
        if(result.code == 200){
            var obj = result.obj;
            for(var i=0;i<obj.length;i++){
                types[i] = obj[i];
            }
        }
    },"json");
    return types;
};
var code;

function showCode(str) {
    if (!code) code = $("#code");
    code.empty();
    code.append("<li>"+str+"</li>");
};

/*产品-停用*/
function member_stop(obj,id){
    layer.confirm('确认要停用吗？',function(index){
        $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
        $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
        $(obj).remove();
        layer.msg('已停用!',{icon: 5,time:1000});
    });
}

/*产品-启用*/
function member_start(obj,id){
    layer.confirm('确认要启用吗？',function(index){
        $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
        $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
        $(obj).remove();
        layer.msg('已启用!',{icon: 6,time:1000});
    });
}
/*产品-编辑*/
function member_edit(title,url,id,w,h){
    layer_show(title,url,w,h);
}

/*产品-删除*/
function member_del(obj,id){
    layer.confirm('确认要删除吗？',function(index){
        $(obj).parents("tr").remove();
        layer.msg('已删除!',{icon:1,time:1000});
    });
}
//面包屑返回值
var index = parent.layer.getFrameIndex(window.name);
parent.layer.iframeAuto(index);
$('.Order_form').on('click', function(){
    var cname = $(this).attr("title");
    var chref = $(this).attr("href");
    var cnames = parent.$('.Current_page').html();
    var herf = parent.$("#iframe").attr("src");
    parent.$('#parentIframe').html(cname);
    parent.$('#iframe').attr("src",chref).ready();;
    parent.$('#parentIframe').css("display","inline-block");
    parent.$('.Current_page').attr({"name":herf,"href":"javascript:void(0)"}).css({"color":"#4c8fbd","cursor":"pointer"});
    //parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+" class='iframeurl'>" + cnames + "</a>");
    parent.layer.close(index);

});
