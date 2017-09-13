package com.example.retrofitdemo03_post;

import java.util.List;

/**
 * 创建日期：2017/9/13 on 下午2:50
 * 描述:
 * 作者:yangliang
 */
public class JavaBean {

    /**
     * ad : [{"id":321,"title":"小精灵大作战盛夏礼包","flag":1,"iconurl":"/allimgs/img_iad/_1501745191560.jpg","addtime":"2017-08-15","giftid":"1501741949","appName":"小精灵大作战","appLogo":"/allimgs/img_iapp/201707/_1501233871973.png","appId":1501233925},{"id":322,"title":"太极熊猫3礼包","flag":1,"iconurl":"/allimgs/img_iad/_1501746337657.jpg","addtime":"2017-08-15","giftid":"1501730798","appName":"太极熊猫3","appLogo":"/allimgs/img_iapp/201701/_1483688735681.png","appId":1483688864},{"id":323,"title":"权倾三国独家礼包","flag":1,"iconurl":"/allimgs/img_iad/_1502779203693.jpg","addtime":"2017-08-14","giftid":"1502700114","appName":"权倾三国","appLogo":"/allimgs/img_iapp/201705/_1493968912703.png","appId":1493968955},{"id":317,"title":"天堂2：血盟周年庆独家礼包","flag":1,"iconurl":"/allimgs/img_iad/_1500890286680.jpg","addtime":"2017-07-17","giftid":"1500889307","appName":"天堂2：血盟","appLogo":"/allimgs/img_iapp/201707/_1500976283247.png","appId":1459239214},{"id":314,"title":"少女咖啡枪1688玩夏日清凉礼包","flag":1,"iconurl":"/allimgs/img_iad/_1499243290349.jpg","addtime":"2017-07-16","giftid":"1499241582","appName":"少女咖啡枪","appLogo":"/allimgs/img_iapp/201611/_1479463123279.png","appId":1467612648}]
     * pageno : 77
     * list : [{"id":"1505206777","iconurl":"/allimgs/img_iapp/201703/_1490596992668.png","giftname":"二册礼包","number":8,"exchanges":1,"type":1,"gname":"幻宠大陆","integral":0,"isintegral":0,"addtime":"2017-09-12","ptype":"1,2,","operators":"","flag":1},{"id":"1505209762","iconurl":"/allimgs/img_iapp/201606/_1464919910173.jpg","giftname":"两周年纪念礼包","number":10,"exchanges":1,"type":1,"gname":"刀锋无双","integral":0,"isintegral":0,"addtime":"2017-09-12","ptype":"1,2,","operators":"","flag":1},{"id":"1505115002","iconurl":"/allimgs/img_iapp/201708/_1502359662874.png","giftname":"公测珍贵礼包","number":13,"exchanges":1,"type":1,"gname":"超次元坦克","integral":0,"isintegral":0,"addtime":"2017-09-11","ptype":"2,","operators":"","flag":1},{"id":"1505115156","iconurl":"/allimgs/img_iapp/201708/_1502359662874.png","giftname":"公测高级礼包","number":99,"exchanges":1,"type":1,"gname":"超次元坦克","integral":0,"isintegral":0,"addtime":"2017-09-11","ptype":"2,","operators":"","flag":1},{"id":"1505115237","iconurl":"/allimgs/img_iapp/201708/_1502359662874.png","giftname":"公测新手礼包","number":9,"exchanges":1,"type":1,"gname":"超次元坦克","integral":0,"isintegral":0,"addtime":"2017-09-11","ptype":"2,","operators":"","flag":1},{"id":"1505115583","iconurl":"/allimgs/img_iapp/201511/_1448446144213.png","giftname":"9月媒体礼包","number":0,"exchanges":5,"type":1,"gname":"航海王强者之路","integral":0,"isintegral":0,"addtime":"2017-09-11","ptype":"1,2,","operators":"","flag":1},{"id":"1505123545","iconurl":"/allimgs/img_iapp/201709/_1505123007515.png","giftname":"首测礼包","number":18,"exchanges":0,"type":1,"gname":"西游诀","integral":0,"isintegral":0,"addtime":"2017-09-11","ptype":"1,","operators":"","flag":1},{"id":"1505123678","iconurl":"/allimgs/img_iapp/201707/_1501217676600.png","giftname":"新服礼包","number":33,"exchanges":0,"type":1,"gname":"大唐荣耀","integral":0,"isintegral":0,"addtime":"2017-09-11","ptype":"1,2,","operators":"","flag":1},{"id":"1504860390","iconurl":"/allimgs/img_iapp/201708/_1503561592151.png","giftname":"守护测试礼包","number":9,"exchanges":2,"type":1,"gname":"恋人之森","integral":0,"isintegral":0,"addtime":"2017-09-08","ptype":"1,2,","operators":"","flag":1},{"id":"1504767201","iconurl":"/allimgs/img_iapp/201708/_1504163694152.png","giftname":"礼包","number":7,"exchanges":1,"type":1,"gname":"暴走战姬","integral":0,"isintegral":0,"addtime":"2017-09-07","ptype":"1,","operators":"","flag":1},{"id":"1504775227","iconurl":"/allimgs/img_iapp/201703/_1490928880061.png","giftname":"十一出游礼包","number":20,"exchanges":0,"type":1,"gname":"光明大陆","integral":0,"isintegral":0,"addtime":"2017-09-07","ptype":"1,2,","operators":"","flag":1},{"id":"1504775440","iconurl":"/allimgs/img_iapp/201508/_1439173429159.jpg","giftname":"中元节礼包","number":16,"exchanges":1,"type":1,"gname":"火线精英","integral":0,"isintegral":0,"addtime":"2017-09-07","ptype":"1,2,","operators":"","flag":1},{"id":"1504775563","iconurl":"/allimgs/img_iapp/201606/_1466128524233.png","giftname":"中元节礼包","number":28,"exchanges":0,"type":1,"gname":"枪战英雄","integral":0,"isintegral":0,"addtime":"2017-09-07","ptype":"1,2,","operators":"","flag":1},{"id":"1504775721","iconurl":"/allimgs/img_iapp/201707/_1500022042770.png","giftname":"中元节礼包","number":23,"exchanges":0,"type":1,"gname":"小小突击队","integral":0,"isintegral":0,"addtime":"2017-09-07","ptype":"1,2,","operators":"","flag":1},{"id":"1504776431","iconurl":"/allimgs/img_iapp/201705/_1493877698496.jpg","giftname":"\u201c卧虎藏龙\u201d礼包","number":27,"exchanges":0,"type":1,"gname":"梦想世界3D","integral":0,"isintegral":0,"addtime":"2017-09-07","ptype":"1,2,","operators":"","flag":1}]
     */

    private int pageno;
    private List<AdBean> ad;
    private List<ListBean> list;

    public int getPageno() {
        return pageno;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public List<AdBean> getAd() {
        return ad;
    }

    public void setAd(List<AdBean> ad) {
        this.ad = ad;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class AdBean {
        /**
         * id : 321
         * title : 小精灵大作战盛夏礼包
         * flag : 1
         * iconurl : /allimgs/img_iad/_1501745191560.jpg
         * addtime : 2017-08-15
         * giftid : 1501741949
         * appName : 小精灵大作战
         * appLogo : /allimgs/img_iapp/201707/_1501233871973.png
         * appId : 1501233925
         */

        private int id;
        private String title;
        private int flag;
        private String iconurl;
        private String addtime;
        private String giftid;
        private String appName;
        private String appLogo;
        private int appId;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public String getIconurl() {
            return iconurl;
        }

        public void setIconurl(String iconurl) {
            this.iconurl = iconurl;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getGiftid() {
            return giftid;
        }

        public void setGiftid(String giftid) {
            this.giftid = giftid;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getAppLogo() {
            return appLogo;
        }

        public void setAppLogo(String appLogo) {
            this.appLogo = appLogo;
        }

        public int getAppId() {
            return appId;
        }

        public void setAppId(int appId) {
            this.appId = appId;
        }
    }

    public static class ListBean {
        /**
         * id : 1505206777
         * iconurl : /allimgs/img_iapp/201703/_1490596992668.png
         * giftname : 二册礼包
         * number : 8
         * exchanges : 1
         * type : 1
         * gname : 幻宠大陆
         * integral : 0
         * isintegral : 0
         * addtime : 2017-09-12
         * ptype : 1,2,
         * operators :
         * flag : 1
         */

        private String id;
        private String iconurl;
        private String giftname;
        private int number;
        private int exchanges;
        private int type;
        private String gname;
        private int integral;
        private int isintegral;
        private String addtime;
        private String ptype;
        private String operators;
        private int flag;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIconurl() {
            return iconurl;
        }

        public void setIconurl(String iconurl) {
            this.iconurl = iconurl;
        }

        public String getGiftname() {
            return giftname;
        }

        public void setGiftname(String giftname) {
            this.giftname = giftname;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getExchanges() {
            return exchanges;
        }

        public void setExchanges(int exchanges) {
            this.exchanges = exchanges;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getGname() {
            return gname;
        }

        public void setGname(String gname) {
            this.gname = gname;
        }

        public int getIntegral() {
            return integral;
        }

        public void setIntegral(int integral) {
            this.integral = integral;
        }

        public int getIsintegral() {
            return isintegral;
        }

        public void setIsintegral(int isintegral) {
            this.isintegral = isintegral;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getPtype() {
            return ptype;
        }

        public void setPtype(String ptype) {
            this.ptype = ptype;
        }

        public String getOperators() {
            return operators;
        }

        public void setOperators(String operators) {
            this.operators = operators;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }
    }
}
