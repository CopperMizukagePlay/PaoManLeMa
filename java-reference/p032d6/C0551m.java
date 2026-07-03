package p032d6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.m */
/* loaded from: classes.dex */
public final class C0551m extends C0569s {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1900c = AtomicIntegerFieldUpdater.newUpdater(C0551m.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0551m(C0548l c0548l, Throwable th, boolean z7) {
        super(th, z7);
        if (th == null) {
            th = new CancellationException("Continuation " + c0548l + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
