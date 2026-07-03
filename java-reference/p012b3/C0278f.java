package p012b3;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p037e3.C0692f;
import p060h5.AbstractC1793a0;
import p077k.C2214r0;
import p102n1.AbstractC2710c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b3.f */
/* loaded from: classes.dex */
public final class C0278f extends AbstractC2710c {

    /* renamed from: v */
    public static final Class f1021v;

    /* renamed from: w */
    public static final Constructor f1022w;

    /* renamed from: x */
    public static final Method f1023x;

    /* renamed from: y */
    public static final Method f1024y;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            method2 = null;
        }
        f1022w = constructor;
        f1021v = cls;
        f1023x = method2;
        f1024y = method;
    }

    @Override // p102n1.AbstractC2710c
    /* renamed from: f */
    public final Typeface mo612f(Context context, C0692f[] c0692fArr) {
        Object obj;
        Typeface typeface;
        boolean z7;
        try {
            obj = f1022w.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C2214r0 c2214r0 = new C2214r0();
            int length = c0692fArr.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    C0692f c0692f = c0692fArr[i7];
                    Uri uri = c0692f.f2246a;
                    Object obj2 = (ByteBuffer) c2214r0.get(uri);
                    if (obj2 == null) {
                        obj2 = AbstractC1793a0.m2965E(context, uri);
                        c2214r0.put(uri, obj2);
                    }
                    if (obj2 == null) {
                        break;
                    }
                    try {
                        z7 = ((Boolean) f1023x.invoke(obj, obj2, Integer.valueOf(c0692f.f2247b), null, Integer.valueOf(c0692f.f2248c), Boolean.valueOf(c0692f.f2249d))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z7 = false;
                    }
                    if (!z7) {
                        break;
                    }
                    i7++;
                } else {
                    try {
                        Object newInstance = Array.newInstance((Class<?>) f1021v, 1);
                        Array.set(newInstance, 0, obj);
                        typeface = (Typeface) f1024y.invoke(null, newInstance);
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, 0);
                    }
                }
            }
        }
        return null;
    }
}
