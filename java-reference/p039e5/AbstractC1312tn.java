package p039e5;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a0.AbstractC0094y0;
import p053g5.C1687f;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1817y;
import p068i5.C2084h;
import p068i5.C2087k;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.tn */
/* loaded from: classes.dex */
public abstract class AbstractC1312tn {

    /* renamed from: a */
    public static final Object f7833a = AbstractC1817y.m3083O(new C1687f("speed_test_profiles", AbstractC1793a0.m2971K("profiles", "selected_profile_id", "history_records", "rate_push_profile_ids", "ignored_update_version")), new C1687f("downloader_settings", AbstractC1793a0.m2970J("directory_uri")));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* renamed from: a */
    public static String m2351a(Context context) {
        String str;
        JSONObject put;
        AbstractC3367j.m5100e(context, "context");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : f7833a.entrySet()) {
            String str2 = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            Map<String, ?> all = context.getSharedPreferences(str2, 0).getAll();
            AbstractC3367j.m5099d(all, "getAll(...)");
            TreeMap treeMap = new TreeMap(all);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : treeMap.entrySet()) {
                if (!set.contains((String) entry2.getKey())) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str3 = (String) entry3.getKey();
                Object value = entry3.getValue();
                if (value instanceof Boolean) {
                    put = new JSONObject().put("type", "boolean").put("value", ((Boolean) value).booleanValue());
                    AbstractC3367j.m5099d(put, "put(...)");
                } else if (value instanceof Integer) {
                    put = new JSONObject().put("type", "int").put("value", ((Number) value).intValue());
                    AbstractC3367j.m5099d(put, "put(...)");
                } else if (value instanceof Long) {
                    put = new JSONObject().put("type", "long").put("value", ((Number) value).longValue());
                    AbstractC3367j.m5099d(put, "put(...)");
                } else if (value instanceof Float) {
                    put = new JSONObject().put("type", "float").put("value", ((Number) value).floatValue());
                    AbstractC3367j.m5099d(put, "put(...)");
                } else if (value instanceof String) {
                    put = new JSONObject().put("type", "string").put("value", value);
                    AbstractC3367j.m5099d(put, "put(...)");
                } else if (value instanceof Set) {
                    JSONObject put2 = new JSONObject().put("type", "stringSet");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (Iterable) value) {
                        if (obj instanceof String) {
                            arrayList.add(obj);
                        }
                    }
                    put = put2.put("value", new JSONArray((Collection) AbstractC1805m.m3060x0(arrayList)));
                    AbstractC3367j.m5099d(put, "put(...)");
                } else {
                    if (value != null) {
                        str = value.getClass().getName();
                    } else {
                        str = null;
                    }
                    throw new IllegalStateException(AbstractC2487d.m4058v("不支持的设置类型：", str).toString());
                }
                jSONObject2.put(str3, put);
            }
            jSONObject.put(str2, jSONObject2);
        }
        String jSONObject3 = new JSONObject().put("format", "paomanlema-settings").put("version", 1).put("preferences", jSONObject).toString(2);
        AbstractC3367j.m5099d(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    /* renamed from: b */
    public static Serializable m2352b(JSONObject jSONObject) {
        String string = jSONObject.getString("type");
        if (string != null) {
            switch (string.hashCode()) {
                case -891985903:
                    if (string.equals("string")) {
                        String string2 = jSONObject.getString("value");
                        AbstractC3367j.m5099d(string2, "getString(...)");
                        return string2;
                    }
                    break;
                case -189292911:
                    if (string.equals("stringSet")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        C2087k c2087k = new C2087k();
                        int length = jSONArray.length();
                        for (int i7 = 0; i7 < length; i7++) {
                            c2087k.add(jSONArray.getString(i7));
                        }
                        C2084h c2084h = c2087k.f12339e;
                        c2084h.m3419b();
                        if (c2084h.f12329m > 0) {
                            return c2087k;
                        }
                        return C2087k.f12338f;
                    }
                    break;
                case 104431:
                    if (string.equals("int")) {
                        return Integer.valueOf(jSONObject.getInt("value"));
                    }
                    break;
                case 3327612:
                    if (string.equals("long")) {
                        return Long.valueOf(jSONObject.getLong("value"));
                    }
                    break;
                case 64711720:
                    if (string.equals("boolean")) {
                        return Boolean.valueOf(jSONObject.getBoolean("value"));
                    }
                    break;
                case 97526364:
                    if (string.equals("float")) {
                        return Float.valueOf((float) jSONObject.getDouble("value"));
                    }
                    break;
            }
        }
        throw new IllegalStateException("不支持的设置类型");
    }

    /* renamed from: c */
    public static String m2353c() {
        return AbstractC0094y0.m185l("paomanlema_settings_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()), ".settings");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00fb  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map m2354d(String str) {
        ?? m2985m;
        JSONObject jSONObject;
        int optInt;
        JSONObject optJSONObject;
        ?? r02 = f7833a;
        Map map = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (AbstractC3367j.m5096a(jSONObject.optString("format"), "paomanlema-settings") && 1 <= (optInt = jSONObject.optInt("version", -1)) && optInt < 2 && (optJSONObject = jSONObject.optJSONObject("preferences")) != null) {
            Set keySet = r02.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (!optJSONObject.has((String) it.next())) {
                    }
                }
            }
            m2985m = new LinkedHashMap(AbstractC1817y.m3082N(r02.size()));
            for (Object obj : r02.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Map.Entry entry = (Map.Entry) obj;
                String str2 = (String) entry.getKey();
                Set set = (Set) entry.getValue();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(str2);
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                }
                C2084h c2084h = new C2084h();
                Iterator<String> keys = optJSONObject2.keys();
                AbstractC3367j.m5099d(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!set.contains(next)) {
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject(next);
                        if (optJSONObject3 != null) {
                            AbstractC3367j.m5097b(next);
                            c2084h.put(next, m2352b(optJSONObject3));
                        } else {
                            throw new IllegalStateException(("无效的设置项：" + next).toString());
                        }
                    }
                }
                m2985m.put(key, c2084h.m3419b());
            }
            if (!(m2985m instanceof C1689h)) {
                map = m2985m;
            }
            return map;
        }
        m2985m = 0;
        if (!(m2985m instanceof C1689h)) {
        }
        return map;
    }

    /* renamed from: e */
    public static void m2355e(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            editor.putFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
            editor.putStringSet(str, AbstractC1805m.m3038F0(arrayList));
            return;
        }
        throw new IllegalStateException("不支持的设置类型");
    }
}
