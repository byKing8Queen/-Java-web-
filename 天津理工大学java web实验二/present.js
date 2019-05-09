/**
 * 
 */
$('#province').combobox({
   url:'GetProvinceInfo',
   valueField: 'province',//指定json中哪一项为值 字段
   testField: 'province',//指定json中哪一项为要显示的文字字段
   panelHeight:'auto',
});