package p170w1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.paoman.lema.R;
import java.util.LinkedHashMap;
import p001a0.C0019e1;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0568r1;
import p039e5.C1306th;
import p047f6.AbstractC1555j;
import p047f6.C1548c;
import p054g6.AbstractC1719t;
import p054g6.InterfaceC1697a0;
import p068i5.AbstractC2080d;
import p069i6.AbstractC2100m;
import p069i6.C2090c;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p085l0.AbstractC2406s;
import p150t5.InterfaceC3281e;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.q2 */
/* loaded from: classes.dex */
public abstract class AbstractC3719q2 {

    /* renamed from: a */
    public static final LinkedHashMap f17680a = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r2v4, types: [g6.z, java.lang.Object] */
    /* renamed from: a */
    public static final InterfaceC1697a0 m5715a(Context context) {
        InterfaceC1697a0 interfaceC1697a0;
        LinkedHashMap linkedHashMap = f17680a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C1548c m2510a = AbstractC1555j.m2510a(-1, 6, null);
                    C0019e1 c0019e1 = new C0019e1((InterfaceC3281e) new C1306th(contentResolver, uriFor, new C3715p2(m2510a, AbstractC3784a.m5801e(Looper.getMainLooper())), m2510a, context, (InterfaceC2313c) null, 6));
                    C0568r1 m1124b = AbstractC0525d0.m1124b();
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    obj = AbstractC1719t.m2777h(c0019e1, new C2090c(AbstractC2080d.m3374B(m1124b, AbstractC2100m.f12376a)), new Object(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                interfaceC1697a0 = (InterfaceC1697a0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1697a0;
    }

    /* renamed from: b */
    public static final AbstractC2406s m5716b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC2406s) {
            return (AbstractC2406s) tag;
        }
        return null;
    }
}
