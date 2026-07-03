package p142s4;

import java.util.Objects;
import p134r4.C3050b;
import p134r4.C3051c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s4.a */
/* loaded from: classes.dex */
public final class C3109a {

    /* renamed from: a */
    public final C3050b f15716a;

    /* renamed from: b */
    public final C3050b f15717b;

    /* renamed from: c */
    public final C3051c f15718c;

    public C3109a(C3050b c3050b, C3050b c3050b2, C3051c c3051c) {
        this.f15716a = c3050b;
        this.f15717b = c3050b2;
        this.f15718c = c3051c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3109a)) {
            return false;
        }
        C3109a c3109a = (C3109a) obj;
        if (!Objects.equals(this.f15716a, c3109a.f15716a) || !Objects.equals(this.f15717b, c3109a.f15717b) || !Objects.equals(this.f15718c, c3109a.f15718c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f15716a) ^ Objects.hashCode(this.f15717b)) ^ Objects.hashCode(this.f15718c);
    }

    public final String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f15716a);
        sb.append(" , ");
        sb.append(this.f15717b);
        sb.append(" : ");
        C3051c c3051c = this.f15718c;
        if (c3051c == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(c3051c.f15631a);
        }
        sb.append(valueOf);
        sb.append(" ]");
        return sb.toString();
    }
}
