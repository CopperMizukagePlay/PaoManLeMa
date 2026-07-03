package p113o5;

import java.lang.reflect.Method;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o5.a */
/* loaded from: classes.dex */
public abstract class AbstractC2818a {

    /* renamed from: a */
    public static final Method f14867a;

    /* renamed from: b */
    public static final Method f14868b;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Method[] methods = Throwable.class.getMethods();
        AbstractC3367j.m5097b(methods);
        int length = methods.length;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            method = null;
            if (i8 < length) {
                method2 = methods[i8];
                if (AbstractC3367j.m5096a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC3367j.m5099d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 1) {
                        cls = parameterTypes[0];
                    } else {
                        cls = null;
                    }
                    if (AbstractC3367j.m5096a(cls, Throwable.class)) {
                        break;
                    }
                }
                i8++;
            } else {
                method2 = null;
                break;
            }
        }
        f14867a = method2;
        int length2 = methods.length;
        while (true) {
            if (i7 >= length2) {
                break;
            }
            Method method3 = methods[i7];
            if (AbstractC3367j.m5096a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i7++;
        }
        f14868b = method;
    }
}
