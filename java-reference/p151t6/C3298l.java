package p151t6;

import java.io.IOException;
import java.util.List;
import p121p6.AbstractC2882a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.l */
/* loaded from: classes.dex */
public final class C3298l extends AbstractC2882a {

    /* renamed from: e */
    public final /* synthetic */ int f16175e = 1;

    /* renamed from: f */
    public final /* synthetic */ C3301o f16176f;

    /* renamed from: g */
    public final /* synthetic */ int f16177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3298l(String str, C3301o c3301o, int i7, List list) {
        super(str, true);
        this.f16176f = c3301o;
        this.f16177g = i7;
    }

    @Override // p121p6.AbstractC2882a
    /* renamed from: a */
    public final long mo4555a() {
        switch (this.f16175e) {
            case 0:
                this.f16176f.f16199o.getClass();
                try {
                    this.f16176f.f16186B.m5038n(this.f16177g, 9);
                    synchronized (this.f16176f) {
                        this.f16176f.f16188D.remove(Integer.valueOf(this.f16177g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f16176f.f16199o.getClass();
                try {
                    this.f16176f.f16186B.m5038n(this.f16177g, 9);
                    synchronized (this.f16176f) {
                        this.f16176f.f16188D.remove(Integer.valueOf(this.f16177g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3298l(String str, C3301o c3301o, int i7, List list, boolean z7) {
        super(str, true);
        this.f16176f = c3301o;
        this.f16177g = i7;
    }
}
