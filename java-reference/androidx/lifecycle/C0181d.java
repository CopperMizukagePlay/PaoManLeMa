package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.d */
/* loaded from: classes.dex */
public final class C0181d {

    /* renamed from: c */
    public static final C0181d f833c = new C0181d();

    /* renamed from: a */
    public final HashMap f834a = new HashMap();

    /* renamed from: b */
    public final HashMap f835b = new HashMap();

    /* renamed from: b */
    public static void m418b(HashMap hashMap, C0179c c0179c, EnumC0201n enumC0201n, Class cls) {
        EnumC0201n enumC0201n2 = (EnumC0201n) hashMap.get(c0179c);
        if (enumC0201n2 != null && enumC0201n != enumC0201n2) {
            throw new IllegalArgumentException("Method " + c0179c.f832b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0201n2 + ", new value " + enumC0201n);
        }
        if (enumC0201n2 == null) {
            hashMap.put(c0179c, enumC0201n);
        }
    }

    /* renamed from: a */
    public final C0177b m419a(Class cls, Method[] methodArr) {
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f834a;
        if (superclass != null) {
            C0177b c0177b = (C0177b) hashMap2.get(superclass);
            if (c0177b == null) {
                c0177b = m419a(superclass, null);
            }
            hashMap.putAll(c0177b.f821b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0177b c0177b2 = (C0177b) hashMap2.get(cls2);
            if (c0177b2 == null) {
                c0177b2 = m419a(cls2, null);
            }
            for (Map.Entry entry : c0177b2.f821b.entrySet()) {
                m418b(hashMap, (C0179c) entry.getKey(), (EnumC0201n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            InterfaceC0218x interfaceC0218x = (InterfaceC0218x) method.getAnnotation(InterfaceC0218x.class);
            if (interfaceC0218x != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC0213t.class.isAssignableFrom(parameterTypes[0])) {
                        i7 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i7 = 0;
                }
                EnumC0201n value = interfaceC0218x.value();
                if (parameterTypes.length > 1) {
                    if (EnumC0201n.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == EnumC0201n.ON_ANY) {
                            i7 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m418b(hashMap, new C0179c(i7, method), value, cls);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0177b c0177b3 = new C0177b(hashMap);
        hashMap2.put(cls, c0177b3);
        this.f835b.put(cls, Boolean.valueOf(z7));
        return c0177b3;
    }
}
