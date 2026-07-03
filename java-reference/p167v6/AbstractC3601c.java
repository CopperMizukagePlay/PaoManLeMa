package p167v6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p060h5.AbstractC1817y;
import p099m6.C2623x;
import p121p6.C2886e;
import p151t6.AbstractC3292f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.c */
/* loaded from: classes.dex */
public abstract class AbstractC3601c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet f17249a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public static final Map f17250b;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C2623x.class.getPackage();
        if (r22 != null) {
            str = r22.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(C2623x.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC3292f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C2886e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f17250b = AbstractC1817y.m3087S(linkedHashMap);
    }
}
