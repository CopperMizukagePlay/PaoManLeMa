package p196z6;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import p006a7.C0126i;
import p006a7.C0131n;
import p006a7.C0134q;
import p006a7.C0138u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z6.a */
/* loaded from: classes.dex */
public final class C3882a implements Closeable {

    /* renamed from: e */
    public final /* synthetic */ int f18178e;

    /* renamed from: f */
    public final boolean f18179f;

    /* renamed from: g */
    public final C0126i f18180g;

    /* renamed from: h */
    public final Object f18181h;

    /* renamed from: i */
    public final Closeable f18182i;

    /* JADX WARN: Type inference failed for: r3v1, types: [a7.a0, java.lang.Object, a7.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, a7.i] */
    public C3882a(int i7, boolean z7) {
        this.f18178e = i7;
        switch (i7) {
            case 1:
                this.f18179f = z7;
                ?? obj = new Object();
                this.f18180g = obj;
                Inflater inflater = new Inflater(true);
                this.f18181h = inflater;
                this.f18182i = new C0134q(new C0138u(obj), inflater);
                return;
            default:
                this.f18179f = z7;
                ?? obj2 = new Object();
                this.f18180g = obj2;
                Deflater deflater = new Deflater(-1, true);
                this.f18181h = deflater;
                this.f18182i = new C0131n(obj2, deflater);
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f18178e) {
            case 0:
                ((C0131n) this.f18182i).close();
                return;
            default:
                ((C0134q) this.f18182i).close();
                return;
        }
    }
}
