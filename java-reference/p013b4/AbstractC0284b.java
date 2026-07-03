package p013b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p077k.C2189f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b4.b */
/* loaded from: classes.dex */
public abstract class AbstractC0284b {

    /* renamed from: a */
    public final C2189f f1033a;

    /* renamed from: b */
    public final C2189f f1034b;

    /* renamed from: c */
    public final C2189f f1035c;

    public AbstractC0284b(C2189f c2189f, C2189f c2189f2, C2189f c2189f3) {
        this.f1033a = c2189f;
        this.f1034b = c2189f2;
        this.f1035c = c2189f3;
    }

    /* renamed from: a */
    public abstract C0285c mo619a();

    /* renamed from: b */
    public final Class m620b(Class cls) {
        String name = cls.getName();
        C2189f c2189f = this.f1035c;
        Class cls2 = (Class) c2189f.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
            c2189f.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: c */
    public final Method m621c(String str) {
        C2189f c2189f = this.f1033a;
        Method method = (Method) c2189f.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC0284b.class.getClassLoader()).getDeclaredMethod("read", AbstractC0284b.class);
            c2189f.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: d */
    public final Method m622d(Class cls) {
        String name = cls.getName();
        C2189f c2189f = this.f1034b;
        Method method = (Method) c2189f.get(name);
        if (method == null) {
            Class m620b = m620b(cls);
            System.currentTimeMillis();
            Method declaredMethod = m620b.getDeclaredMethod("write", cls, AbstractC0284b.class);
            c2189f.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: e */
    public abstract boolean mo623e(int i7);

    /* renamed from: f */
    public final Parcelable m624f(Parcelable parcelable, int i7) {
        if (!mo623e(i7)) {
            return parcelable;
        }
        return ((C0285c) this).f1037e.readParcelable(C0285c.class.getClassLoader());
    }

    /* renamed from: g */
    public final InterfaceC0286d m625g() {
        String readString = ((C0285c) this).f1037e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC0286d) m621c(readString).invoke(null, mo619a());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    /* renamed from: h */
    public abstract void mo626h(int i7);

    /* renamed from: i */
    public final void m627i(InterfaceC0286d interfaceC0286d) {
        if (interfaceC0286d == null) {
            ((C0285c) this).f1037e.writeString(null);
            return;
        }
        try {
            ((C0285c) this).f1037e.writeString(m620b(interfaceC0286d.getClass()).getName());
            C0285c mo619a = mo619a();
            try {
                m622d(interfaceC0286d.getClass()).invoke(null, interfaceC0286d, mo619a);
                Parcel parcel = mo619a.f1037e;
                int i7 = mo619a.f1041i;
                if (i7 >= 0) {
                    int i8 = mo619a.f1036d.get(i7);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(dataPosition - i8);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
            } catch (InvocationTargetException e10) {
                if (e10.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e10.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(interfaceC0286d.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }
}
