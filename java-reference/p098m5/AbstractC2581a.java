package p098m5;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m5.a */
/* loaded from: classes.dex */
public abstract class AbstractC2581a implements InterfaceC2313c, InterfaceC2584d, Serializable {

    /* renamed from: e */
    public final InterfaceC2313c f13997e;

    public AbstractC2581a(InterfaceC2313c interfaceC2313c) {
        this.f13997e = interfaceC2313c;
    }

    /* renamed from: g */
    public InterfaceC2584d mo1215g() {
        InterfaceC2313c interfaceC2313c = this.f13997e;
        if (interfaceC2313c instanceof InterfaceC2584d) {
            return (InterfaceC2584d) interfaceC2313c;
        }
        return null;
    }

    /* renamed from: k */
    public InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: l */
    public StackTraceElement mo3099l() {
        int i7;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i8;
        InterfaceC2585e interfaceC2585e = (InterfaceC2585e) getClass().getAnnotation(InterfaceC2585e.class);
        String str2 = null;
        if (interfaceC2585e == null) {
            return null;
        }
        int m4118v = interfaceC2585e.m4118v();
        if (m4118v <= 1) {
            int i9 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i8 = num.intValue();
                } else {
                    i8 = 0;
                }
                i7 = i8 - 1;
            } catch (Exception unused) {
                i7 = -1;
            }
            if (i7 >= 0) {
                i9 = interfaceC2585e.m4116l()[i7];
            }
            C2586f c2586f = AbstractC2587g.f14005b;
            C2586f c2586f2 = AbstractC2587g.f14004a;
            if (c2586f == null) {
                try {
                    C2586f c2586f3 = new C2586f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    AbstractC2587g.f14005b = c2586f3;
                    c2586f = c2586f3;
                } catch (Exception unused2) {
                    AbstractC2587g.f14005b = c2586f2;
                    c2586f = c2586f2;
                }
            }
            if (c2586f != c2586f2 && (method = c2586f.f14001a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = c2586f.f14002b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = c2586f.f14003c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                }
            }
            if (str2 == null) {
                str = interfaceC2585e.m4114c();
            } else {
                str = str2 + '/' + interfaceC2585e.m4114c();
            }
            return new StackTraceElement(str, interfaceC2585e.m4117m(), interfaceC2585e.m4115f(), i9);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + m4118v + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: m */
    public abstract Object mo29m(Object obj);

    @Override // p082k5.InterfaceC2313c
    /* renamed from: n */
    public final void mo663n(Object obj) {
        InterfaceC2313c interfaceC2313c = this;
        while (true) {
            AbstractC2581a abstractC2581a = (AbstractC2581a) interfaceC2313c;
            InterfaceC2313c interfaceC2313c2 = abstractC2581a.f13997e;
            AbstractC3367j.m5097b(interfaceC2313c2);
            try {
                obj = abstractC2581a.mo29m(obj);
                if (obj == EnumC2465a.f13750e) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC1793a0.m2985m(th);
            }
            abstractC2581a.mo4113o();
            if (interfaceC2313c2 instanceof AbstractC2581a) {
                interfaceC2313c = interfaceC2313c2;
            } else {
                interfaceC2313c2.mo663n(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object mo3099l = mo3099l();
        if (mo3099l == null) {
            mo3099l = getClass().getName();
        }
        sb.append(mo3099l);
        return sb.toString();
    }

    /* renamed from: o */
    public void mo4113o() {
    }
}
