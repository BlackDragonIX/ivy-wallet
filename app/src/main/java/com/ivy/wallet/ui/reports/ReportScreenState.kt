package com.ivy.wallet.ui.reports

import com.ivy.wallet.domain.data.TransactionHistoryItem
import com.ivy.wallet.domain.data.core.Account
import com.ivy.wallet.domain.data.core.Category
import com.ivy.wallet.domain.data.core.Transaction
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import java.util.*

data class ReportScreenState(
    val baseCurrency: String = "",
    val balance: Double = 0.0,
    val income: Double = 0.0,
    val expenses: Double = 0.0,
    val upcomingIncome: Double = 0.0,
    val upcomingExpenses: Double = 0.0,
    val overdueIncome: Double = 0.0,
    val overdueExpenses: Double = 0.0,
    val history: ImmutableList<TransactionHistoryItem> = persistentListOf(),
    val upcomingTransactions: ImmutableList<Transaction> = persistentListOf(),
    val overdueTransactions: ImmutableList<Transaction> = persistentListOf(),
    val categories: ImmutableList<Category> = persistentListOf(),
    val accounts: ImmutableList<Account> = persistentListOf(),
    val upcomingExpanded: Boolean = false,
    val overdueExpanded: Boolean = false,
    val filter: ReportFilter? = null,
    val loading: Boolean = false,
    val accountIdFilters: ImmutableList<UUID> = persistentListOf(),
    val transactions: ImmutableList<Transaction> = persistentListOf(),
    val filterOverlayVisible: Boolean = false,
    val showTransfersAsIncExpCheckbox: Boolean = false,
    val treatTransfersAsIncExp: Boolean = false
)
