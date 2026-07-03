package p118p3;

import androidx.lifecycle.InterfaceC0213t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p039e5.C1036kq;
import p053g5.C1689h;
import p053g5.InterfaceC1682a;
import p060h5.AbstractC1793a0;
import p085l0.AbstractC2397p1;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p3.d */
/* loaded from: classes.dex */
public abstract class AbstractC2879d {

    /* renamed from: a */
    public static final AbstractC2397p1 f15050a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof p085l0.AbstractC2397p1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (p085l0.AbstractC2397p1) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object m2985m;
        Object obj = null;
        try {
            ClassLoader classLoader = InterfaceC0213t.class.getClassLoader();
            AbstractC3367j.m5097b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
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
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (!(m2985m instanceof C1689h)) {
            obj = m2985m;
        }
        AbstractC2397p1 abstractC2397p1 = (AbstractC2397p1) obj;
        if (abstractC2397p1 == null) {
            abstractC2397p1 = new AbstractC2397p1(new C1036kq(7));
        }
        f15050a = abstractC2397p1;
    }
}
