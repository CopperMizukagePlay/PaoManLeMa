package p069i6;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import p015b6.AbstractC0307n;
import p040e6.AbstractC1508d;
import p040e6.C1505a;
import p040e6.C1507c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.m */
/* loaded from: classes.dex */
public abstract class AbstractC2100m {

    /* renamed from: a */
    public static final C1507c f12376a;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, e6.a] */
    static {
        String str;
        int i7 = AbstractC2106s.f12382a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = AbstractC0307n.m668G(AbstractC0307n.m664C(Arrays.asList(new Object()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((C1505a) obj).getClass();
                    do {
                        ((C1505a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((C1505a) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    f12376a = new C1507c(AbstractC1508d.m2440a(mainLooper));
                    return;
                }
                throw new IllegalStateException("The main looper is not available");
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
