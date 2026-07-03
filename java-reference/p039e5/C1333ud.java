package p039e5;

import android.content.Intent;
import android.media.session.MediaSession;
import com.paoman.lema.KeepAliveService;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ud */
/* loaded from: classes.dex */
public final class C1333ud extends MediaSession.Callback {

    /* renamed from: a */
    public final /* synthetic */ KeepAliveService f7924a;

    public C1333ud(KeepAliveService keepAliveService) {
        this.f7924a = keepAliveService;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        KeepAliveService keepAliveService = this.f7924a;
        Intent intent = new Intent(keepAliveService, (Class<?>) KeepAliveService.class);
        intent.setAction("com.paoman.lema.keepalive.MEDIA_PAUSE");
        keepAliveService.startService(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        KeepAliveService keepAliveService = this.f7924a;
        Intent intent = new Intent(keepAliveService, (Class<?>) KeepAliveService.class);
        intent.setAction("com.paoman.lema.keepalive.MEDIA_PLAY");
        keepAliveService.startService(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        KeepAliveService keepAliveService = this.f7924a;
        Intent intent = new Intent(keepAliveService, (Class<?>) KeepAliveService.class);
        intent.setAction("com.paoman.lema.keepalive.STOP");
        keepAliveService.startService(intent);
    }
}
