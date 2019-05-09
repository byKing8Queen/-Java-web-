/**
 * 
 */
$('#province').combobox({
   url:'GetProvinceInfo',
   textField: 'province',//指定json中哪一项为需要显示的文字字段
   valueField: 'province',//指定json中哪一项为值字段
   panelHeight: 110,//规定一个固定值后，当数据比较多时，下拉选框就会出现滑动条
});