package p179x3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p039e5.C1036kq;
import p053g5.C1689h;
import p053g5.InterfaceC1682a;
import p060h5.AbstractC1793a0;
import p085l0.AbstractC2397p1;
import p158u5.AbstractC3367j;
import p172w3.InterfaceC3782f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x3.a */
/* loaded from: classes.dex */
public abstract class AbstractC3822a {

    /* renamed from: a */
    public static final AbstractC2397p1 f18029a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof p085l0.AbstractC2397p1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (p085l0.AbstractC2397p1) r1;
     */
    static {
        Object m2985m;
        Object obj = null;
        try {
            ClassLoader classLoader = InterfaceC3782f.class.getClassLoader();
            AbstractC3367j.m5097b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            AbstractC3367j.m5099d(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (annotations[i7] instanceof InterfaceC1682a) {
                    break;
                } else {
                    i7++;
                }
            }
            m2985m = null;
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (!(m2985m instanceof C1689h)) {
            obj = m2985m;
        }
        AbstractC2397p1 abstractC2397p1 = (AbstractC2397p1) obj;
        if (abstractC2397p1 == null) {
            abstractC2397p1 = new AbstractC2397p1(new C1036kq(13));
        }
        f18029a = abstractC2397p1;
    }
}
