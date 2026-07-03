package p012b3;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b3.h */
/* loaded from: classes.dex */
public final class C0280h extends C0279g {
    @Override // p012b3.C0279g
    /* renamed from: M */
    public final Typeface mo614M(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1027v, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1026B.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p012b3.C0279g
    /* renamed from: O */
    public final Method mo615O(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
