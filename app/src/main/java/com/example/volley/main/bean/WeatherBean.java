package com.example.volley.main.bean;

import com.example.volley.base.BaseBean;

import java.util.List;

public class WeatherBean extends BaseBean {


    /**
     * code : 200
     * msg : 成功!
     * data : {"yesterday":{"date":"9日星期三","high":"高温 26℃","fx":"东北风","low":"低温 14℃","fl":"<![CDATA[3-4级]]>","type":"晴"},"city":"杭州","aqi":"56","forecast":[{"date":"10日星期四","high":"高温 27℃","fengli":"<![CDATA[3-4级]]>","low":"低温 16℃","fengxiang":"东风","type":"晴"},{"date":"11日星期五","high":"高温 28℃","fengli":"<![CDATA[<3级]]>","low":"低温 19℃","fengxiang":"东南风","type":"多云"},{"date":"12日星期六","high":"高温 29℃","fengli":"<![CDATA[<3级]]>","low":"低温 20℃","fengxiang":"南风","type":"阵雨"},{"date":"13日星期天","high":"高温 29℃","fengli":"<![CDATA[<3级]]>","low":"低温 23℃","fengxiang":"南风","type":"阵雨"},{"date":"14日星期一","high":"高温 32℃","fengli":"<![CDATA[<3级]]>","low":"低温 24℃","fengxiang":"南风","type":"阵雨"}],"ganmao":"各项气象条件适宜，无明显降温过程，发生感冒机率较低。","wendu":"22"}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * yesterday : {"date":"9日星期三","high":"高温 26℃","fx":"东北风","low":"低温 14℃","fl":"<![CDATA[3-4级]]>","type":"晴"}
         * city : 杭州
         * aqi : 56
         * forecast : [{"date":"10日星期四","high":"高温 27℃","fengli":"<![CDATA[3-4级]]>","low":"低温 16℃","fengxiang":"东风","type":"晴"},{"date":"11日星期五","high":"高温 28℃","fengli":"<![CDATA[<3级]]>","low":"低温 19℃","fengxiang":"东南风","type":"多云"},{"date":"12日星期六","high":"高温 29℃","fengli":"<![CDATA[<3级]]>","low":"低温 20℃","fengxiang":"南风","type":"阵雨"},{"date":"13日星期天","high":"高温 29℃","fengli":"<![CDATA[<3级]]>","low":"低温 23℃","fengxiang":"南风","type":"阵雨"},{"date":"14日星期一","high":"高温 32℃","fengli":"<![CDATA[<3级]]>","low":"低温 24℃","fengxiang":"南风","type":"阵雨"}]
         * ganmao : 各项气象条件适宜，无明显降温过程，发生感冒机率较低。
         * wendu : 22
         */

        private YesterdayBean yesterday;
        private String city;
        private String aqi;
        private String ganmao;
        private String wendu;
        private List<ForecastBean> forecast;

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 9日星期三
             * high : 高温 26℃
             * fx : 东北风
             * low : 低温 14℃
             * fl : <![CDATA[3-4级]]>
             * type : 晴
             */

            private String date;
            private String high;
            private String fx;
            private String low;
            private String fl;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ForecastBean {
            /**
             * date : 10日星期四
             * high : 高温 27℃
             * fengli : <![CDATA[3-4级]]>
             * low : 低温 16℃
             * fengxiang : 东风
             * type : 晴
             */

            private String date;
            private String high;
            private String fengli;
            private String low;
            private String fengxiang;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
