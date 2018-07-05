package com.jsonvalidate;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by nabilulaleem.md on 05-06-2018.
 */
public class JsonValidate {

    private static JSONObject checkNotNull(JSONObject object){
        if(object == null){
            return null;
        }else{
            return object;
        }
    }

    private static JSONArray checkNotNull(JSONArray object){
        if(object == null){
            return null;
        }else{
            return object;
        }
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static String view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable String expectedValue) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){return jsonObject.getString(key);}
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static int view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable int expectedValue) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){return jsonObject.getInt(key);}
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static double view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable double expectedValue) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){return jsonObject.getDouble(key);}
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static float view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable float expectedValue) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){return Float.parseFloat(jsonObject.getString(key));}
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static boolean view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable boolean expectedValue) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){return jsonObject.getBoolean(key);}
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static String view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable String expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){
            String value = jsonObject.getString(key);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return value;
        }
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static int view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable int expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){
            String value = jsonObject.getString(key);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return Integer.parseInt(value);
        }
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static double view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable double expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){
            String value = jsonObject.getString(key);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return Double.parseDouble(value);
        }
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static float view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable float expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){
            String value = jsonObject.getString(key);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return Float.parseFloat(value);
        }
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static boolean view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable boolean expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){
            String value = jsonObject.getString(key);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return Boolean.parseBoolean(value);
        }
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static JSONObject view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable JSONObject expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){
            JSONObject value = jsonObject.getJSONObject(key);
            if(isEmpty && value.length() == 0){
                return expectedValue;
            }
            return value;
        }
        return expectedValue;
    }

    /**
     * @param jsonObject
     * @param key
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static JSONArray view(@Nullable JSONObject jsonObject, @Nullable String key, @Nullable JSONArray expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonObject) == null){return expectedValue;}
        if(!jsonObject.isNull(key)){
            JSONArray value = jsonObject.getJSONArray(key);
            if(isEmpty && value.length() == 0){
                return expectedValue;
            }
            return value;
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static JSONObject view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable JSONObject expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            JSONObject value = jsonArray.getJSONObject(index);
            if(isEmpty && value.length() == 0){
                return expectedValue;
            }
            return value;
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static JSONArray view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable JSONArray expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            JSONArray value = jsonArray.getJSONArray(index);
            if(isEmpty && value.length() == 0){
                return expectedValue;
            }
            return value;
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static String view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable String expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            String value = jsonArray.getString(index);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return value;
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static int view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable int expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            String value = jsonArray.getString(index);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return Integer.parseInt(value);
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static float view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable float expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            String value = jsonArray.getString(index);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return Float.parseFloat(value);
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static double view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable double expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            String value = jsonArray.getString(index);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return Double.parseDouble(value);
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @param isEmpty
     * @return
     * @throws JSONException
     */
    public static boolean view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable boolean expectedValue, @Nullable boolean isEmpty) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            String value = jsonArray.getString(index);
            if(isEmpty && value.equals("")){
                return expectedValue;
            }
            return Boolean.parseBoolean(value);
        }
        return expectedValue;
    }


    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static String view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable String expectedValue) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            return jsonArray.getString(index);
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static int view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable int expectedValue) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            return jsonArray.getInt(index);
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static float view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable float expectedValue) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            return Float.parseFloat(jsonArray.getString(index));
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static double view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable double expectedValue) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            return jsonArray.getDouble(index);
        }
        return expectedValue;
    }

    /**
     * @param jsonArray
     * @param index
     * @param expectedValue
     * @return
     * @throws JSONException
     */
    public static boolean view(@Nullable JSONArray jsonArray, @Nullable int index, @Nullable boolean expectedValue) throws JSONException {
        if(checkNotNull(jsonArray) == null){return expectedValue;}
        if(!jsonArray.isNull(index)){
            return jsonArray.getBoolean(index);
        }
        return expectedValue;
    }
}
