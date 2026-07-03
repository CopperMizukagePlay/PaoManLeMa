package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1806n;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC0204o0 {

    /* renamed from: a */
    public static final List f869a = AbstractC1806n.m3067O(Application.class, C0188g0.class);

    /* renamed from: b */
    public static final List f870b = AbstractC3784a.m5817z(C0188g0.class);

    /* renamed from: a */
    public static final Constructor m464a(Class cls, List list) {
        AbstractC3367j.m5100e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC3367j.m5099d(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC3367j.m5099d(parameterTypes, "getParameterTypes(...)");
            List m3031X = AbstractC1804l.m3031X(parameterTypes);
            if (list.equals(m3031X)) {
                return constructor;
            }
            if (list.size() == m3031X.size() && m3031X.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC0206p0 m465b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC0206p0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
