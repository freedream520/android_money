/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.renjie;

public final class R {
    public static final class anim {
        public static final int push_left_out_slide=0x7f040000;
        public static final int push_right_out_slide=0x7f040001;
        public static final int push_top_out=0x7f040002;
        public static final int scale_show=0x7f040003;
    }
    public static final class array {
        public static final int diaryType=0x7f050004;
        public static final int diarytype=0x7f050000;
        public static final int ggtitle1=0x7f050006;
        public static final int ggtitle10=0x7f05000c;
        public static final int ggtitle11=0x7f05000f;
        public static final int ggtitle12=0x7f050010;
        public static final int ggtitle13=0x7f050011;
        public static final int ggtitle14=0x7f050012;
        public static final int ggtitle15=0x7f050013;
        public static final int ggtitle16=0x7f050014;
        public static final int ggtitle17=0x7f050015;
        public static final int ggtitle18=0x7f050016;
        public static final int ggtitle19=0x7f050017;
        public static final int ggtitle20=0x7f050018;
        public static final int ggtitle21=0x7f050019;
        public static final int ggtitle4=0x7f050007;
        public static final int ggtitle6=0x7f050008;
        public static final int ggtitle7=0x7f050009;
        public static final int ggtitle8=0x7f05000a;
        public static final int ggtitle9=0x7f05000b;
        public static final int ggtitle_a10=0x7f05000d;
        public static final int ggtitle_b10=0x7f05000e;
        public static final int gongguo=0x7f050002;
        public static final int gongguoId=0x7f050003;
        public static final int sorttype=0x7f050001;
        public static final int statisticsType=0x7f050005;
    }
    public static final class attr {
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int autoAdapt=0x7f010000;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int collapsible=0x7f010001;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int handle_trackball_press=0x7f010005;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int indent_width=0x7f010004;
        /** <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>top</code></td><td>0x30</td><td> Push object to the top of its container, not changing its size. </td></tr>
<tr><td><code>bottom</code></td><td>0x50</td><td> Push object to the bottom of its container, not changing its size. </td></tr>
<tr><td><code>left</code></td><td>0x03</td><td> Push object to the left of its container, not changing its size. </td></tr>
<tr><td><code>right</code></td><td>0x05</td><td> Push object to the right of its container, not changing its size. </td></tr>
<tr><td><code>center_vertical</code></td><td>0x10</td><td> Place object in the vertical center of its container, not changing its size. </td></tr>
<tr><td><code>fill_vertical</code></td><td>0x70</td><td> Grow the vertical size of the object if needed so it completely fills its container. </td></tr>
<tr><td><code>center_horizontal</code></td><td>0x01</td><td> Place object in the horizontal center of its container, not changing its size. </td></tr>
<tr><td><code>fill_horizontal</code></td><td>0x07</td><td> Grow the horizontal size of the object if needed so it completely fills its container. </td></tr>
<tr><td><code>center</code></td><td>0x11</td><td> Place the object in the center of its container in both the vertical and horizontal axis, not changing its size. </td></tr>
<tr><td><code>fill</code></td><td>0x77</td><td> Grow the horizontal and vertical size of the object if needed so it completely fills its container. </td></tr>
<tr><td><code>clip_vertical</code></td><td>0x80</td><td>
        Additional option that can be set to have the top and/or bottom edges of the child clipped to its container's bounds.
        The clip will be based on the vertical gravity: a top gravity will clip the bottom edge, a bottom gravity will clip the top
        edge, and neither will clip both edges.
            </td></tr>
<tr><td><code>clip_horizontal</code></td><td>0x08</td><td>
        Additional option that can be set to have the left and/or right edges of the child clipped to its container's bounds.
        The clip will be based on the horizontal gravity: a left gravity will clip the right edge, a right gravity will clip the
        left edge, and neither will clip both edges.
            </td></tr>
</table>
         */
        public static final int indicator_gravity=0x7f010006;
        /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static final int src_collapsed=0x7f010003;
        /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static final int src_expanded=0x7f010002;
    }
    public static final class dimen {
        public static final int btn_size=0x7f070009;
        public static final int editTextSize=0x7f070006;
        public static final int input_width=0x7f070001;
        public static final int margin_width=0x7f070002;
        public static final int menu_height=0x7f070004;
        public static final int money_list_height=0x7f070000;
        public static final int text_width=0x7f070003;
        public static final int titleTextSize=0x7f070007;
        public static final int title_btn_height=0x7f070005;
        public static final int title_btn_size=0x7f070008;
        public static final int title_btn_width=0x7f07000a;
    }
    public static final class drawable {
        public static final int bg=0x7f020000;
        public static final int blank=0x7f020001;
        public static final int button_01=0x7f020002;
        public static final int button_02=0x7f020003;
        public static final int close=0x7f020004;
        public static final int collapsed=0x7f020005;
        public static final int darkgray=0x7f020037;
        public static final int dialog_details_bg=0x7f020006;
        public static final int expanded=0x7f020007;
        public static final int ic_action_search=0x7f020008;
        public static final int ic_launcher=0x7f020009;
        public static final int icon_1_n=0x7f02000a;
        public static final int icon_2_n=0x7f02000b;
        public static final int icon_3_n=0x7f02000c;
        public static final int icon_4_n=0x7f02000d;
        public static final int icon_5_n=0x7f02000e;
        public static final int item_1=0x7f02000f;
        public static final int item_2=0x7f020010;
        public static final int item_3=0x7f020011;
        public static final int layout_bg=0x7f020012;
        public static final int list_bg_sel=0x7f020013;
        public static final int menu_bg=0x7f020014;
        public static final int menu_sel=0x7f020015;
        public static final int monthview_bg=0x7f020016;
        public static final int nav_base_icon01=0x7f020017;
        public static final int nav_base_icon02=0x7f020018;
        public static final int nav_base_icon03=0x7f020019;
        public static final int nav_base_icon04=0x7f02001a;
        public static final int nav_press_icon01=0x7f02001b;
        public static final int nav_press_icon02=0x7f02001c;
        public static final int nav_press_icon03=0x7f02001d;
        public static final int nav_press_icon04=0x7f02001e;
        public static final int navigation_next_item=0x7f02001f;
        public static final int off_bg=0x7f020020;
        public static final int on_bg=0x7f020021;
        public static final int open=0x7f020022;
        public static final int red=0x7f020039;
        public static final int selector_list_bg=0x7f020023;
        public static final int selector_menu_bg=0x7f020024;
        public static final int shape_bottom_corner_no_top_line=0x7f020025;
        public static final int shape_corner_gridview=0x7f020026;
        public static final int shape_no_corner_without_bottom=0x7f020027;
        public static final int shape_top_corner_no_bottom_line=0x7f020028;
        public static final int sidebar_divider=0x7f020029;
        public static final int state1=0x7f02002a;
        public static final int state2=0x7f02002b;
        public static final int tab_btn_bg=0x7f02002c;
        public static final int tab_btn_bg_d=0x7f02002d;
        public static final int tab_btn_bg_n=0x7f02002e;
        public static final int tab_btn_bg_s=0x7f02002f;
        public static final int tabs_group_bg=0x7f020030;
        public static final int toggle=0x7f020031;
        public static final int topnavbg=0x7f020032;
        public static final int true_ico=0x7f020033;
        public static final int tx32=0x7f020034;
        public static final int wheel_bg=0x7f020035;
        public static final int wheel_val=0x7f020036;
        public static final int white=0x7f020038;
    }
    public static final class id {
        public static final int GridView=0x7f060043;
        public static final int ItemImage=0x7f060044;
        public static final int ItemText=0x7f060045;
        public static final int LinearLayout=0x7f06001c;
        public static final int ListView=0x7f06001f;
        public static final int RelativeLayout_Item=0x7f06002a;
        public static final int arrow=0x7f06002f;
        public static final int backbtn=0x7f060030;
        public static final int bottom=0x7f060001;
        public static final int btn1=0x7f060050;
        public static final int btn2=0x7f060051;
        public static final int btn3=0x7f060052;
        public static final int center=0x7f060008;
        public static final int center_horizontal=0x7f060006;
        public static final int center_vertical=0x7f060004;
        public static final int chooseTime_btn=0x7f060020;
        public static final int chooseTime_btn2=0x7f06003d;
        public static final int clip_horizontal=0x7f06000b;
        public static final int clip_vertical=0x7f06000a;
        public static final int config_inremoteIp=0x7f060047;
        public static final int config_port=0x7f060049;
        public static final int content=0x7f06001a;
        public static final int date=0x7f060017;
        public static final int day=0x7f06000c;
        public static final int diaryContent=0x7f060014;
        public static final int diaryDate=0x7f060011;
        public static final int diaryTime=0x7f060012;
        public static final int diary_tp=0x7f060013;
        public static final int fill=0x7f060009;
        public static final int fill_horizontal=0x7f060007;
        public static final int fill_vertical=0x7f060005;
        public static final int gongguo_table=0x7f060023;
        public static final int item_image=0x7f06002b;
        public static final int item_text=0x7f06002c;
        public static final int jiami=0x7f060015;
        public static final int layout1=0x7f06004c;
        public static final int left=0x7f060002;
        public static final int linearlayout_contentView=0x7f06000f;
        public static final int loginbtn=0x7f06003a;
        public static final int lv=0x7f060053;
        public static final int main_radio=0x7f060026;
        public static final int menu_name=0x7f06001d;
        public static final int menu_settings=0x7f060059;
        public static final int money=0x7f06002e;
        public static final int moneyDescText=0x7f060041;
        public static final int moneyText=0x7f06003c;
        public static final int moneydesc=0x7f060040;
        public static final int moneytype=0x7f06002d;
        public static final int month=0x7f06000d;
        public static final int next=0x7f060033;
        public static final int obj1=0x7f06001b;
        public static final int passtext=0x7f060038;
        public static final int password=0x7f060037;
        public static final int plan=0x7f060022;
        public static final int plan_show=0x7f060021;
        public static final int quitbtn=0x7f06003b;
        public static final int radio_button1=0x7f060027;
        public static final int radio_button2=0x7f060028;
        public static final int radio_button3=0x7f060029;
        public static final int remoteIp=0x7f060048;
        public static final int remotePort=0x7f06004a;
        public static final int returnbtn=0x7f06001e;
        public static final int right=0x7f060003;
        public static final int saveDiary_btn=0x7f060016;
        public static final int saveGonguo_btn=0x7f060024;
        public static final int savebtn=0x7f060042;
        public static final int selector_address=0x7f060058;
        public static final int showpass=0x7f060039;
        public static final int sort=0x7f06003e;
        public static final int span=0x7f060032;
        public static final int spinner_sort=0x7f06003f;
        public static final int status=0x7f060025;
        public static final int tabhost=0x7f06004b;
        public static final int time=0x7f060018;
        public static final int titile_gre_ym=0x7f060010;
        public static final int top=0x7f060000;
        public static final int top_btn=0x7f060031;
        public static final int tp=0x7f060019;
        public static final int tree_view_item_icon=0x7f060056;
        public static final int tree_view_item_title=0x7f060057;
        public static final int treeview_list_item_frame=0x7f06004f;
        public static final int treeview_list_item_image=0x7f06004e;
        public static final int treeview_list_item_image_layout=0x7f06004d;
        public static final int tv1=0x7f060054;
        public static final int tv2=0x7f060055;
        public static final int untext=0x7f060046;
        public static final int username=0x7f060035;
        public static final int usertext=0x7f060036;
        public static final int widget37=0x7f060034;
        public static final int year=0x7f06000e;
    }
    public static final class layout {
        public static final int date_layout=0x7f030000;
        public static final int diary_index=0x7f030001;
        public static final int diary_item=0x7f030002;
        public static final int diary_list=0x7f030003;
        public static final int gongguo_index=0x7f030004;
        public static final int gongguo_item=0x7f030005;
        public static final int gongguo_list=0x7f030006;
        public static final int homepage2=0x7f030007;
        public static final int item_menu=0x7f030008;
        public static final int list_main=0x7f030009;
        public static final int list_main_item=0x7f03000a;
        public static final int list_main_old=0x7f03000b;
        public static final int list_money2=0x7f03000c;
        public static final int list_money_item2=0x7f03000d;
        public static final int login=0x7f03000e;
        public static final int money_index=0x7f03000f;
        public static final int money_list=0x7f030010;
        public static final int more=0x7f030011;
        public static final int more_item=0x7f030012;
        public static final int myconfig=0x7f030013;
        public static final int tabhost_statismoney=0x7f030014;
        public static final int tree_list_item_wrapper=0x7f030015;
        public static final int tree_list_main=0x7f030016;
        public static final int tree_lv_item=0x7f030017;
        public static final int tree_view_item_layout=0x7f030018;
    }
    public static final class menu {
        public static final int activity_main=0x7f0a0000;
    }
    public static final class string {
        public static final int app_name=0x7f080001;
        public static final int callbtn=0x7f080013;
        public static final int callstr=0x7f080011;
        public static final int con_about=0x7f080030;
        public static final int con_aboutStr=0x7f080031;
        public static final int con_back=0x7f08002c;
        public static final int con_cancel=0x7f08002f;
        public static final int con_chooseDate=0x7f080037;
        public static final int con_diarysort_prompt=0x7f080036;
        public static final int con_info_msg=0x7f08001b;
        public static final int con_leave=0x7f080034;
        public static final int con_ok=0x7f080028;
        public static final int con_quitStr=0x7f080033;
        public static final int con_return=0x7f08002a;
        public static final int con_returnTop=0x7f08002b;
        public static final int con_save=0x7f08001c;
        public static final int con_see_button=0x7f080029;
        public static final int con_setStr=0x7f080032;
        public static final int con_sort_prompt=0x7f080035;
        public static final int con_statistics=0x7f08002d;
        public static final int con_statistics_title=0x7f08002e;
        public static final int config_inpasword=0x7f080040;
        public static final int config_inremoteIp=0x7f080041;
        public static final int config_inremotePort=0x7f080042;
        public static final int config_inusername=0x7f080043;
        public static final int config_ok=0x7f08003e;
        public static final int config_pasword=0x7f08003f;
        public static final int config_please_pasword=0x7f080044;
        public static final int config_remoteIp=0x7f08003d;
        public static final int config_remoteport=0x7f08001e;
        public static final int config_show_pasword=0x7f080045;
        public static final int config_username=0x7f08003c;
        public static final int default_pass=0x7f08004a;
        public static final int default_user=0x7f080049;
        public static final int delete_all_confirm=0x7f080024;
        public static final int delete_button=0x7f080022;
        public static final int delete_confirm=0x7f080025;
        public static final int delete_success=0x7f080023;
        public static final int dft_pass=0x7f08004c;
        public static final int dft_user=0x7f08004b;
        public static final int dialog_menu_item_0=0x7f080038;
        public static final int dialog_menu_item_1=0x7f080039;
        public static final int dialog_menu_item_2=0x7f08003a;
        public static final int dialog_menu_item_3=0x7f08003b;
        public static final int diary_content=0x7f080065;
        public static final int diary_date=0x7f080063;
        public static final int diary_jiami=0x7f080066;
        public static final int diary_list=0x7f080061;
        public static final int diary_time=0x7f080064;
        public static final int diary_title=0x7f080062;
        public static final int diary_type=0x7f08000b;
        public static final int error_pass=0x7f080048;
        public static final int error_user=0x7f080047;
        public static final int gongguo_list=0x7f080060;
        public static final int gongguo_plan=0x7f080067;
        public static final int gongguo_planmake=0x7f080068;
        public static final int gongguo_title=0x7f08005f;
        public static final int gongguo_toPlan=0x7f080069;
        public static final int hello=0x7f080007;
        public static final int homepage=0x7f08004e;
        public static final int ididentify=0x7f080014;
        public static final int ididentifybtn=0x7f080015;
        public static final int ididentifytext=0x7f080017;
        public static final int idshibietitle=0x7f080016;
        public static final int licaixitongtitle=0x7f080008;
        public static final int login_quit=0x7f08004d;
        public static final int login_sure=0x7f080046;
        public static final int main_config=0x7f080004;
        public static final int main_diary=0x7f080003;
        public static final int main_more=0x7f080006;
        public static final int main_report=0x7f080005;
        public static final int main_shouye=0x7f080002;
        public static final int menu_settings=0x7f080000;
        public static final int moneydesc=0x7f08000e;
        public static final int moneystr=0x7f08000c;
        public static final int more_backupall=0x7f080055;
        public static final int more_config=0x7f080052;
        public static final int more_deletemoney=0x7f080054;
        public static final int more_diary=0x7f080057;
        public static final int more_diarylist=0x7f08005c;
        public static final int more_gongguo=0x7f080056;
        public static final int more_gongguolist=0x7f08005b;
        public static final int more_hualun=0x7f08005e;
        public static final int more_moneylist=0x7f08005d;
        public static final int more_senddiary=0x7f08005a;
        public static final int more_sendgongguo=0x7f080058;
        public static final int more_sendmoney=0x7f080059;
        public static final int more_tree=0x7f080053;
        public static final int msg_return=0x7f08001a;
        public static final int save_failure=0x7f08001f;
        public static final int save_success=0x7f08001d;
        public static final int savemoney_msg=0x7f080019;
        public static final int savetoserverbtn=0x7f080020;
        public static final int savetoserverbtn2=0x7f080021;
        public static final int senddiary=0x7f080050;
        public static final int sendgongguo=0x7f080051;
        public static final int sendingdata=0x7f080027;
        public static final int sendmoney=0x7f08004f;
        public static final int showmessage=0x7f080018;
        public static final int sortstr=0x7f08000d;
        public static final int testId=0x7f08000f;
        public static final int timestr=0x7f080009;
        public static final int timestr2=0x7f08000a;
        public static final int urlbtn=0x7f080012;
        public static final int urlstr=0x7f080010;
        public static final int waitting=0x7f080026;
    }
    public static final class style {
        public static final int Theme_Translucent=0x7f090008;
        public static final int gongguoitem=0x7f090005;
        public static final int line=0x7f090001;
        public static final int main_tab_bottom=0x7f090000;
        public static final int redstyle=0x7f090004;
        public static final int saveBtnStyle=0x7f090003;
        public static final int textstyle1=0x7f090002;
        public static final int timetext=0x7f090007;
        public static final int titlestyle=0x7f090006;
    }
    public static final class styleable {
        /** Attributes that can be used with a TreeListView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #TreeListView_autoAdapt com.renjie:autoAdapt}</code></td><td></td></tr>
           <tr><td><code>{@link #TreeListView_collapsible com.renjie:collapsible}</code></td><td></td></tr>
           <tr><td><code>{@link #TreeListView_handle_trackball_press com.renjie:handle_trackball_press}</code></td><td></td></tr>
           <tr><td><code>{@link #TreeListView_indent_width com.renjie:indent_width}</code></td><td></td></tr>
           <tr><td><code>{@link #TreeListView_indicator_gravity com.renjie:indicator_gravity}</code></td><td></td></tr>
           <tr><td><code>{@link #TreeListView_src_collapsed com.renjie:src_collapsed}</code></td><td></td></tr>
           <tr><td><code>{@link #TreeListView_src_expanded com.renjie:src_expanded}</code></td><td></td></tr>
           </table>
           @see #TreeListView_autoAdapt
           @see #TreeListView_collapsible
           @see #TreeListView_handle_trackball_press
           @see #TreeListView_indent_width
           @see #TreeListView_indicator_gravity
           @see #TreeListView_src_collapsed
           @see #TreeListView_src_expanded
         */
        public static final int[] TreeListView = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003,
            0x7f010004, 0x7f010005, 0x7f010006
        };
        /**
          <p>This symbol is the offset where the {@link com.renjie.R.attr#autoAdapt}
          attribute's value can be found in the {@link #TreeListView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.renjie:autoAdapt
        */
        public static final int TreeListView_autoAdapt = 0;
        /**
          <p>This symbol is the offset where the {@link com.renjie.R.attr#collapsible}
          attribute's value can be found in the {@link #TreeListView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.renjie:collapsible
        */
        public static final int TreeListView_collapsible = 1;
        /**
          <p>This symbol is the offset where the {@link com.renjie.R.attr#handle_trackball_press}
          attribute's value can be found in the {@link #TreeListView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.renjie:handle_trackball_press
        */
        public static final int TreeListView_handle_trackball_press = 5;
        /**
          <p>This symbol is the offset where the {@link com.renjie.R.attr#indent_width}
          attribute's value can be found in the {@link #TreeListView} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.renjie:indent_width
        */
        public static final int TreeListView_indent_width = 4;
        /**
          <p>This symbol is the offset where the {@link com.renjie.R.attr#indicator_gravity}
          attribute's value can be found in the {@link #TreeListView} array.


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>top</code></td><td>0x30</td><td> Push object to the top of its container, not changing its size. </td></tr>
<tr><td><code>bottom</code></td><td>0x50</td><td> Push object to the bottom of its container, not changing its size. </td></tr>
<tr><td><code>left</code></td><td>0x03</td><td> Push object to the left of its container, not changing its size. </td></tr>
<tr><td><code>right</code></td><td>0x05</td><td> Push object to the right of its container, not changing its size. </td></tr>
<tr><td><code>center_vertical</code></td><td>0x10</td><td> Place object in the vertical center of its container, not changing its size. </td></tr>
<tr><td><code>fill_vertical</code></td><td>0x70</td><td> Grow the vertical size of the object if needed so it completely fills its container. </td></tr>
<tr><td><code>center_horizontal</code></td><td>0x01</td><td> Place object in the horizontal center of its container, not changing its size. </td></tr>
<tr><td><code>fill_horizontal</code></td><td>0x07</td><td> Grow the horizontal size of the object if needed so it completely fills its container. </td></tr>
<tr><td><code>center</code></td><td>0x11</td><td> Place the object in the center of its container in both the vertical and horizontal axis, not changing its size. </td></tr>
<tr><td><code>fill</code></td><td>0x77</td><td> Grow the horizontal and vertical size of the object if needed so it completely fills its container. </td></tr>
<tr><td><code>clip_vertical</code></td><td>0x80</td><td>
        Additional option that can be set to have the top and/or bottom edges of the child clipped to its container's bounds.
        The clip will be based on the vertical gravity: a top gravity will clip the bottom edge, a bottom gravity will clip the top
        edge, and neither will clip both edges.
            </td></tr>
<tr><td><code>clip_horizontal</code></td><td>0x08</td><td>
        Additional option that can be set to have the left and/or right edges of the child clipped to its container's bounds.
        The clip will be based on the horizontal gravity: a left gravity will clip the right edge, a right gravity will clip the
        left edge, and neither will clip both edges.
            </td></tr>
</table>
          @attr name com.renjie:indicator_gravity
        */
        public static final int TreeListView_indicator_gravity = 6;
        /**
          <p>This symbol is the offset where the {@link com.renjie.R.attr#src_collapsed}
          attribute's value can be found in the {@link #TreeListView} array.


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          @attr name com.renjie:src_collapsed
        */
        public static final int TreeListView_src_collapsed = 3;
        /**
          <p>This symbol is the offset where the {@link com.renjie.R.attr#src_expanded}
          attribute's value can be found in the {@link #TreeListView} array.


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          @attr name com.renjie:src_expanded
        */
        public static final int TreeListView_src_expanded = 2;
    };
}
