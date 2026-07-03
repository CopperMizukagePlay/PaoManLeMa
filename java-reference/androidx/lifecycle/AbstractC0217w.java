package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p024c6.AbstractC0451r;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public abstract class AbstractC0217w {

    /* renamed from: a */
    public static final HashMap f888a = new HashMap();

    /* renamed from: b */
    public static final HashMap f889b = new HashMap();

    /* renamed from: a */
    public static void m475a(Constructor constructor, InterfaceC0211s interfaceC0211s) {
        try {
            AbstractC3367j.m5097b(constructor.newInstance(interfaceC0211s));
            throw new ClassCastException();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* renamed from: b */
    public static int m476b(Class cls) {
        Constructor<?> constructor;
        boolean z7;
        boolean z8;
        boolean z9;
        String str;
        HashMap hashMap = f888a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i7 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r32 != null) {
                    str = r32.getName();
                } else {
                    str = "";
                }
                AbstractC3367j.m5097b(str);
                if (str.length() != 0) {
                    AbstractC3367j.m5097b(canonicalName);
                    canonicalName = canonicalName.substring(str.length() + 1);
                    AbstractC3367j.m5099d(canonicalName, "substring(...)");
                }
                AbstractC3367j.m5097b(canonicalName);
                String concat = AbstractC0451r.m969K(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException(e7);
            }
            HashMap hashMap2 = f889b;
            if (constructor != null) {
                hashMap2.put(cls, AbstractC3784a.m5817z(constructor));
            } else {
                C0181d c0181d = C0181d.f833c;
                HashMap hashMap3 = c0181d.f835b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z7 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                if (((InterfaceC0218x) declaredMethods[i8].getAnnotation(InterfaceC0218x.class)) != null) {
                                    c0181d.m419a(cls, declaredMethods);
                                    z7 = true;
                                    break;
                                }
                                i8++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z7 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e8) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
                    }
                }
                if (!z7) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0211s.class.isAssignableFrom(superclass)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        AbstractC3367j.m5097b(superclass);
                        if (m476b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            AbstractC3367j.m5097b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    AbstractC3367j.m5099d(interfaces, "getInterfaces(...)");
                    int length2 = interfaces.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            Class<?> cls2 = interfaces[i9];
                            if (cls2 != null && InterfaceC0211s.class.isAssignableFrom(cls2)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                AbstractC3367j.m5097b(cls2);
                                if (m476b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                AbstractC3367j.m5097b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i9++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i7 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i7));
        return i7;
    }
}
