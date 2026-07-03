package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C0179c {

    /* renamed from: a */
    public final int f831a;

    /* renamed from: b */
    public final Method f832b;

    public C0179c(int i7, Method method) {
        this.f831a = i7;
        this.f832b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0179c)) {
            return false;
        }
        C0179c c0179c = (C0179c) obj;
        if (this.f831a == c0179c.f831a && this.f832b.getName().equals(c0179c.f832b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f832b.getName().hashCode() + (this.f831a * 31);
    }
}
