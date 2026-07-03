package p012b3;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p037e3.C0692f;
import p060h5.AbstractC1793a0;
import p102n1.AbstractC2710c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b3.g */
/* loaded from: classes.dex */
public class C0279g extends C0277e {

    /* renamed from: A */
    public final Method f1025A;

    /* renamed from: B */
    public final Method f1026B;

    /* renamed from: v */
    public final Class f1027v;

    /* renamed from: w */
    public final Constructor f1028w;

    /* renamed from: x */
    public final Method f1029x;

    /* renamed from: y */
    public final Method f1030y;

    /* renamed from: z */
    public final Method f1031z;

    public C0279g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = m613N(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = mo615O(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1027v = cls;
        this.f1028w = constructor;
        this.f1029x = method2;
        this.f1030y = method3;
        this.f1031z = method4;
        this.f1025A = method5;
        this.f1026B = method;
    }

    /* renamed from: N */
    public static Method m613N(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* renamed from: M */
    public Typeface mo614M(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1027v, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1026B.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: O */
    public Method mo615O(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p012b3.C0277e, p102n1.AbstractC2710c
    /* renamed from: f */
    public final Typeface mo612f(Context context, C0692f[] c0692fArr) {
        Object obj;
        boolean z7;
        Typeface mo614M;
        boolean z8;
        if (c0692fArr.length >= 1) {
            Method method = this.f1029x;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (C0692f c0692f : c0692fArr) {
                        if (c0692f.f2251f == 0) {
                            Uri uri = c0692f.f2246a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, AbstractC1793a0.m2965E(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f1028w.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = c0692fArr.length;
                        int i7 = 0;
                        boolean z9 = false;
                        while (true) {
                            Method method2 = this.f1025A;
                            if (i7 < length) {
                                C0692f c0692f2 = c0692fArr[i7];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0692f2.f2246a);
                                if (byteBuffer != null) {
                                    try {
                                        z8 = ((Boolean) this.f1030y.invoke(obj, byteBuffer, Integer.valueOf(c0692f2.f2247b), null, Integer.valueOf(c0692f2.f2248c), Integer.valueOf(c0692f2.f2249d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z8 = false;
                                    }
                                    if (!z8) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z9 = true;
                                }
                                i7++;
                                z9 = z9;
                            } else if (!z9) {
                                method2.invoke(obj, null);
                            } else {
                                try {
                                    z7 = ((Boolean) this.f1031z.invoke(obj, null)).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    z7 = false;
                                }
                                if (z7 && (mo614M = mo614M(obj)) != null) {
                                    return Typeface.create(mo614M, 0);
                                }
                            }
                        }
                    }
                } else {
                    C0692f m4337k = AbstractC2710c.m4337k(c0692fArr);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m4337k.f2246a, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m4337k.f2248c).setItalic(m4337k.f2249d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }
}
