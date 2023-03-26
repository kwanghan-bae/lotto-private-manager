package com.lotto.manager.domain.ticket.incoming

import com.lotto.manager.domain.ticket.LottoTicket

interface GetLottoTicketQuery {
    fun byId(id: Long): LottoTicket
}
